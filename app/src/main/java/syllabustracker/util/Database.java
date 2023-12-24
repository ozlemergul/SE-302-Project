package syllabustracker.util;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {

    private Connection connection;

    public Database() {
        this.connection = null;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void connect() {
        try {
            String url = "jdbc:sqlite:syllabusTracker_DB.db";
            connection = DriverManager.getConnection(url);
            System.out.println("Connection succesfull");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void disconnect() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        disconnect();
    }
    

    public void insertData(String tableName, Object... columnValues) {

        try {
            // Build the SQL query dynamically based on the table name and provided column values
            StringBuilder insertQuery = new StringBuilder("INSERT INTO ")
                    .append(tableName)
                    .append(" VALUES (");
            for (int i = 0; i < columnValues.length; i++) {
                insertQuery.append("?");
                if (i < columnValues.length - 1) {
                    insertQuery.append(", ");
                }
            }
            insertQuery.append(")");
    
            // Create a PreparedStatement to execute the insert query
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery.toString())) {
                // Set values for each parameter in the prepared statement
                for (int i = 0; i < columnValues.length; i++) {
                    preparedStatement.setObject(i + 1, columnValues[i]);
                }
    
                // Execute the insert query
                preparedStatement.executeUpdate();
            }
    
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Map<String, String> fetchRow(Database db, String tableName, String conditionColumn, String conditionValue) {
        Map<String, String> rowData = new HashMap<>();

        try {
            if(db.getConnection() == null || db.getConnection().isClosed()){
                db.connect();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String query = "SELECT * FROM " + tableName + " WHERE " + conditionColumn + " = ?";
        try (Connection conn = db.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {

            preparedStatement.setString(1, conditionValue);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                ResultSetMetaData metaData = rs.getMetaData();
                int numColumns = metaData.getColumnCount();

                if (rs.next()) {
                    for (int i = 1; i <= numColumns; i++) {
                        String columnName = metaData.getColumnName(i);
                        String columnValue = rs.getString(i);
                        rowData.put(columnName, columnValue);
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return rowData;
    }

    public ArrayList<String> fetchColumn(String tableName, String columnName, String conditionColumn, String conditionValue) {
        ArrayList<String> columnValues = new ArrayList<>();

        try {
            // Build the SQL query dynamically based on the table name, column name, and condition
            String query = "SELECT " + columnName + " FROM " + tableName + " WHERE " + conditionColumn + " = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                // Set the condition value in the prepared statement
                preparedStatement.setString(1, conditionValue);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // Process the result set and retrieve values from the specified column
                    while (resultSet.next()) {
                        String columnValue = resultSet.getString(columnName);
                        columnValues.add(columnValue);
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return columnValues;
    }
    
    
    public void deleteColumnData(int id, String columnName, String tableName) {
                            try {
                                // Build the SQL query dynamically based on the table name, column name, ID column, and ID value
                                String deleteColumnQuery = "UPDATE " + tableName + " SET " + columnName + " = NULL WHERE id = ?";

                                // Execute the update query with the provided ID
                                try (PreparedStatement preparedStatement = connection.prepareStatement(deleteColumnQuery)) {
                                    preparedStatement.setInt(1, id);
                                    preparedStatement.executeUpdate();
                                }

                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }



    public void displayRecords(String tableName) {
                            List<Map<String, Object>> records = new ArrayList<>();

                            try {
                                // Build the SQL query dynamically based on the table name
                                String selectQuery = "SELECT * FROM " + tableName;

                                // Execute the query
                                try(PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
                                     ResultSet resultSet = preparedStatement.executeQuery()){

                                    // Process the result set
                                    ResultSetMetaData metaData = resultSet.getMetaData();
                                    int columnCount = metaData.getColumnCount();

                    while (resultSet.next()) {
                                        Map<String, Object> record = new HashMap<>();

                                        // Populate the record map with column names and values
                        for (int i = 1; i <= columnCount; i++) {
                                            String columnName = metaData.getColumnName(i);
                                            Object columnValue = resultSet.getObject(i);
                                            record.put(columnName, columnValue);
                                        }records.add(record);
                                        System.out.println();
                    }

                }
                
            } catch (SQLException e) {
                e.printStackTrace();
        }                

    }



    
}
                
    


package syllabustracker.util;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
    private boolean isConnected;
    private Connection connection;

    public Database() {
        this.connection = null;
        this.isConnected = false;
    }

    public Connection getConnection() {
        return connection;
    }

    public boolean isConnected() {
        return connection != null;
    }

    public void connect() {
        try {
            String url = "jdbc:sqlite:syllabusTracker_DB.db";
            connection = DriverManager.getConnection(url);
            isConnected = true; // Set isConnected to true upon successful connection
            System.out.println("Connection successful");
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

    public ResultSet executeQuery(String query, List<Object> params) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            int index = 1;
            for (Object param : params) {
                preparedStatement.setObject(index++, param);
            }

            return preparedStatement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
            return null; 
        }
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
    

    // This method deletes the whole table, I am not sure that we need it.

    /*public void deleteTheTable(int id, String tableName) {
                            try {
                                // Build the SQL query dynamically based on the table name, ID column, and ID value
                                String deleteQuery = "DELETE FROM " + tableName + " WHERE id = " +id;

                                // Execute the delete query with the provided ID
                                try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
                                    preparedStatement.setInt(1, id);
                                    preparedStatement.executeUpdate();
                                }

                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }*/


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

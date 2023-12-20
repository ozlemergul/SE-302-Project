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

    public void connect() {

        try {
            String url = "jdbc:sqlite:syllabusTracker_DB.db";
            // Connect to the database (creates a new file if not exists)
            connection = DriverManager.getConnection(url);
            System.out.println("Connection succesfull");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet executeQuery(String query, Object... params) {
        if (connection == null) {
            connect();
        }

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            // Set parameters, if any
            int parameterIndex = 1;
            for (Object param : params) {
                statement.setObject(parameterIndex++, param);

            }

            // Execute the query
            Object result = statement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void close() {
        disconnect();
    }


    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
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

    public void deleteData(int id, String tableName) {
        try {
            // Build the SQL query dynamically based on the table name, ID column, and ID value
            String deleteQuery = "DELETE FROM " + tableName + " WHERE " + id + " = ?";

            // Execute the delete query with the provided ID
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public List<Map<String, Object>> displayRecords(String tableName) {
        List<Map<String, Object>> records = new ArrayList<>();

        try {
            // Build the SQL query dynamically based on the table name
            String selectQuery = "SELECT * FROM " + tableName;

            // Execute the query
            try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                // Process the result set
                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();
                Map<String, Object> record = new HashMap<>();
                while (resultSet.next()) {


                    // Populate the record map with column names and values
                    for (int i = 1; i <= columnCount; i++) {
                        String columnName = metaData.getColumnName(i);
                        Object columnValue = resultSet.getObject(i);
                        record.put(columnName, columnValue);

                    }

                } records.add(record);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return records;
    }
}

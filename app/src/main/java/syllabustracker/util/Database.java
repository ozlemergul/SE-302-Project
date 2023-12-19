package syllabustracker.util;

import java.sql.*;

public class Database {

    private Connection connection;

    public Database() {
        this.connection = null;
    }

    public void connect() {

        try {
            String url = "jdbc:sqlite:/syllabusTracker_DB.db";
            // Connect to the database (creates a new file if not exists)
            connection = DriverManager.getConnection(url);
            System.out.println("Connection successfull");

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

    public ResultSet fetchData(String query, Object... params) {
        if (connection == null) {
            connect();
        }

        try {
            PreparedStatement statement = connection.prepareStatement(query);

            // Set parameters, if any
            int parameterIndex = 1;
            for (Object param : params) {
                statement.setObject(parameterIndex++, param);
            }

            // Execute the query and return the result set
            return statement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
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

    public void deleteData(int id,String tableName) {
        try {
            // Specify the SQL query to delete data from the table
            String deleteQuery = "DELETE FROM "+tableName+" WHERE id = ?";

            // Create a PreparedStatement to execute the delete query
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
                preparedStatement.setInt(1, id);

                // Execute the delete query
                preparedStatement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayRecords(Database databaseHandler,String tableName) {
        // Specify the SQL query to select data from the table
        String selectQuery = "SELECT * FROM "+tableName;


        // Execute the query using the DatabaseHandler
        ResultSet resultSet = databaseHandler.executeQuery(selectQuery);

        // Process the result set
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String column1 = resultSet.getString("column1");
                    String column2 = resultSet.getString("column2");

                    // Print or process the retrieved data
                    System.out.println("ID: " + id + ", Column1: " + column1 + ", Column2: " + column2);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

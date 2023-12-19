package syllabustracker.util;

import java.sql.*;

public class Database {


    private Connection connection;

    public Database() {

        this.connection = null;
    }

    public void connect() {

        try {
            String url = "jdbc:sqlite:D:/SE302Project/app/syllabusTracker_DB.db";
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

}

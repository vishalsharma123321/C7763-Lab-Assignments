package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertRecordUsingCallableStatement {
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USER = "username";
    private static final String PASSWORD = "password";

    // JDBC variables for opening, closing and managing connection
    private static Connection connection = null;
    private static CallableStatement callableStatement = null;

    public static void main(String[] args) {
        try {
            // Connect to the database
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // SQL query to call a stored procedure to insert record
            String sql = "{CALL insert_record(?, ?, ?)}"; // replace insert_record with your stored procedure name

            // Create a CallableStatement object
            callableStatement = connection.prepareCall(sql);

            // Set parameters for the stored procedure
            callableStatement.setString(1, "John Doe"); // Example name
            callableStatement.setString(2, "john.doe@example.com"); // Example email
            callableStatement.setInt(3, 30); // Example age

            // Execute the stored procedure
            callableStatement.execute();

            System.out.println("Record inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close CallableStatement and Connection
            try {
                if (callableStatement != null) {
                    callableStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

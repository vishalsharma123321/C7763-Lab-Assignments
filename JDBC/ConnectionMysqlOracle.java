/*

QUESTIONS:-
Q1) Write a code and make a connection with an Oracle database Using JDBC steps?

Q2) After making connection create a table named "Student" and insert a few records in the table.

*/

// Author: Vishal Sharma
package JDBC;
// Step 1 : Import neccesary utilities from java.sql package.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnectionMySqlOracle {
    public static void main(String[] args) {
        connectToOracleDB(); // Initiates connection to Oracle database.
    }

    // Method to connect to an Oracle database.
    public static void connectToOracleDB() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // Load Oracle JDBC driver.
            System.out.println("Driver loaded successfully.");

            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "self", "admin");
            // Establish connection to the Oracle database.
            if (connection != null) {
                System.out.println("Connected to Oracle Database successfully.");

                // Prepare statements for database operations.
                PreparedStatement createTable = connection.prepareStatement("CREATE TABLE Student (roll_id INT PRIMARY KEY, name VARCHAR(20) NOT NULL)");
                PreparedStatement insertStudent1 = connection.prepareStatement("INSERT INTO Student VALUES(?, ?)");
                PreparedStatement insertStudent2 = connection.prepareStatement("INSERT INTO Student VALUES(?, ?)");

                // Set values for insertion
                int rollId1 = 20219836;
                String name1 = "Vishal Sharma";
                int rollId2 = 20213658;
                String name2 = "Manmohan Singh";

                // Log the inserted data
                System.out.println("Inserting record 1: roll_id=" + rollId1 + ", name=" + name1);
                System.out.println("Inserting record 2: roll_id=" + rollId2 + ", name=" + name2);

                insertStudent1.setInt(1, rollId1);
                insertStudent1.setString(2, name1);
                insertStudent2.setInt(1, rollId2);
                insertStudent2.setString(2, name2);

                // Execute the prepared statements.
                createTable.execute();
                insertStudent1.execute();
                insertStudent2.execute();

                System.out.println("Student table created and records inserted successfully.");
            } else {
                System.out.println("Connection not established. Please try again.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
OUTPUT
Driver loaded successfully.
Connected to Oracle Database successfully.
Inserting record 1: roll_id=20219836, name=Vishal Sharma
Inserting record 2: roll_id=20213658, name=Manmohan Singh
Student table created and records inserted successfully.
*/

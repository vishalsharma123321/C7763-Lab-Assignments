/*
 ************************************ First Question  ********************************.
 Q1)  WAP to insert record in a table using CallableStatement in java?
*/

/*
  Name = VISHAL SHARMA .
*/
package DataBase;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class CallableStatements {
    public static void main(String[] args) {

        try {
            // Load the Oracle JDBC driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish connection to the database
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "self", "admin");

            // Prepare a CallableStatement to call a stored procedure or function
            CallableStatement cs = con.prepareCall("{call Save_customer_record(?,?,?,?)}");

            // Register the OUT parameter
            cs.registerOutParameter(4, java.sql.Types.VARCHAR);

            // Create a Scanner object to read user input
            Scanner sc = new Scanner(System.in);

            // Prompt the user to enter ID
            System.out.println("Enter the id ; ");
            int id = sc.nextInt();
            // Set the ID parameter in the CallableStatement
            cs.setInt(1, id);

            // Prompt the user to enter Name
            System.out.println("Enter the name ; ");
            String name = sc.next();
            // Set the Name parameter in the CallableStatement
            cs.setString(2, name);

            // Prompt the user to enter City
            System.out.println("Enter the city ; ");
            String city = sc.next();
            // Set the City parameter in the CallableStatement
            cs.setString(3, city);

            // Execute the CallableStatement
            cs.execute();

            // Retrieve the result from the OUT parameter
            String result = cs.getString(4);

            // Print the result
            System.out.println("result " + result);

        } catch (Exception e) {
            // Handle any exceptions
            e.printStackTrace();
        }
    }
}

/*
  output
ID	         NAME	    CITY
20219836	vishal	   sharma
20215632	manmoahn   singh
20216342	riya	   sharma
20219326	donna	   bonita
*/
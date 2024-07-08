/*
 ************************************ Second Question  ********************************.
 Q3)Create a program to calculate the annual salary of an employee by using inheritance.
    Create a class named "User" with the following properties and methods: Properties: id(int):
    representing the id of the User name(String):representing the name of the User Constructor:
    Declare parameterized constructor to initialize id and name. Create a subclass named "Employee"
    that inherits from the "User" class. Add the following additional properties and methods: Properties:
    salary(double):representing the monthly salary of the employee Method: double calculateAnnualSalary():to
    calculate the annual salary earned by the employee. In the main method, create an object of "Employee" class.
    Calculate the annual salary of the employee and display it.. [Hint:Use constructor or setter methods to set the value]
*/

/*
  Name = Vishal Sharma.
*/

// User class representing a basic user
class User {
    int id;
    String name;

    // Constructor to initialize id and name
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// Employee class inheriting from User class
class Employee extends User {
    double salary;

    // Constructor to initialize id, name, and salary
    public Employee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12;
    }
}

// Main class
public class AnnualSalary {
    public static void main(String[] args) {
        // Creating an object of Employee class
        Employee employee = new Employee(1, "Vishal", 50000.0);

        // Calculating annual salary
        double annualSalary = employee.calculateAnnualSalary();

        // Displaying the annual salary of the employee
        System.out.println("Annual salary of employee " + employee.name + " is $" + annualSalary);
    }
}
/*
  first output.
Annual salary of employee Vishal is $900000.0

 ****************************************

  Second output with Salary changed.
Annual salary of employee Vishal is $600000.0
*/
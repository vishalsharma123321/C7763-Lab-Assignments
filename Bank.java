/*
 ************************************ First question **********************************.
 Q1) Create a Bank class and declare an instance variable named amount of type double.

 Create parameterized constructor to initialize variable “amount” with value 10000.

 Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).

 Calculate withdrawal based on some condition  like

 If amount is sufficient then “withdraw successful” message will be printed on the console

 and amount should be updated after withdraw. Later on, deposit 5000 in the account balance.

  At the end display total balance on the console.
 */


/*
  Name = Vishal Sharma.
 */
import java.util.Scanner;
public class Bank {
    private double amount;

    // Parameterized constructor to initialize amount with 10000
    public Bank() {
        this.amount = 10000;
    }

    // Method to withdraw amount
    public void withdraw(double withdrawalAmount) {
        if (amount >= withdrawalAmount) {
            System.out.println("Withdrawal successful");
            amount -= withdrawalAmount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Method to deposit amount
    public void deposit(double depositAmount) {
        amount += depositAmount;
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        // Creating an instance of the Bank class
        Bank account = new Bank();

        // Withdraw 5000 if sufficient balance exists, then deposit 5000
        account.withdraw(15000);
        account.deposit(5000);

        // Display the total balance
        account.displayBalance();
    }
}

///*
//  first output.
//  Withdrawal successful
//  Total balance: 10000.0
//
// ****************************************
//
//  Second output with amount changed.
//  Insufficient funds
//  Total balance: 15000.0
// */









/*
 ************************************ Second Question  ********************************.
 Q2) Write a program to input two numbers and find the maximum between
     two numbers using the conditional/ternary operator.
 */

/*
  Name = Vishal Sharma.
// */
//import java.util.Scanner;
//public class FindMinMaxUsingTernnary {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Input two numbers
//        System.out.print("Enter the first number: ");
//        double num1 = scanner.nextDouble();
//        System.out.print("Enter the second number: ");
//        double num2 = scanner.nextDouble();
//
//        // Finding the maximum using the ternary operator
//        double maxNum = (num1 > num2) ? num1 : num2;
//
//        // Display the maximum number
//        System.out.println("The maximum number is: " + maxNum);
//
//        scanner.close();
//    }
//}

/*
  first output.
  Enter the first number: 99
  Enter the second number: 54
  The maximum number is: 99.0

 ****************************************

  Second output with numbers changed.
  Enter the first number: -1
  Enter the second number: 54
  The maximum number is: 54.0
 */
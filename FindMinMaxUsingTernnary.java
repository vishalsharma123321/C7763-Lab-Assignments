/*
 ************************************ Second Question  ********************************.
 Q2) Write a program to input two numbers and find the maximum between
     two numbers using the conditional/ternary operator.
 */

/*
  Name = Vishal Sharma.
 */
import java.util.Scanner;
public class FindMinMaxUsingTernnary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Finding the maximum using the ternary operator
        double maxNum = (num1 > num2) ? num1 : num2;

        // Display the maximum number
        System.out.println("The maximum number is: " + maxNum);

        scanner.close();
    }
}

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
/*
 ************************************ First question **********************************.
 Q1) Write a program to check whether a number is a Strong number or not. Strong number is
     a special number whose sum of factorial of digits is equal to the original number.
     For example: 145 is a strong number. Since, 1! + 4! + 5! = 145
*/


/*
  Name = Vishal Sharma.
*/
import java.util.Scanner;
public class StrongNumber {
    // Function to calculate the factorial of a number
    public static int factorial(int num) {
        if (num == 0 || num == 1)
            return 1;
        else
            return num * factorial(num - 1);
    }

    // Function to check if a number is a strong number
    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;

        // Calculating sum of factorials of digits
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        // Checking if the sum is equal to the original number
        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Checking if the entered number is a strong number
        if (isStrongNumber(num))
            System.out.println(num + " is a Strong number.");
        else
            System.out.println(num + " is not a Strong number.");

        scanner.close();
    }
}
/*
  first output.
Enter a number: 145
145 is a Strong number.

 ****************************************

  Second output with Number changed.
Enter a number: 200
200 is not a Strong number.
*/







//
///*
// ************************************ Second Question  ********************************.
// Q2) .Write a program to check leap year using if else. How to check whether a given year
//      is a leap year or not. [Hint:Take an input of any number. Store it in some variable say year.
//      If a year is exactly divisible by 4 and not divisible by 100, then it is a leap year.
//      Or if a year is exactly divisible by 400 then it is a leap year.]
//*/
//
///*
//  Name = Vishal Sharma.
//*/
//import java.util.Scanner;
//public class LeapYear {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a year: ");
//        int year = scanner.nextInt();
//
//        // Checking if the entered year is a leap year
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
//            System.out.println(year + " is a leap year.");
//        else
//            System.out.println(year + " is not a leap year.");
//
//        scanner.close();
//    }
//}
///*
//  first output.
//Enter a year: 2000
//2000 is a leap year.
//
// ****************************************
//
//  Second output with Year changed.
//Enter a year: 2025
//2025 is not a leap year.
//*/

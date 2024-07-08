/*
 ************************************ Second Question  ********************************.
 Q2) .Write a program to check leap year using if else. How to check whether a given year
      is a leap year or not. [Hint:Take an input of any number. Store it in some variable say year.
      If a year is exactly divisible by 4 and not divisible by 100, then it is a leap year.
      Or if a year is exactly divisible by 400 then it is a leap year.]
*/

/*
  Name = Vishal Sharma.
*/
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Checking if the entered year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");

        scanner.close();
    }
}
/*
  first output.
Enter a year: 2000
2000 is a leap year.

 ****************************************

  Second output with Year changed.
Enter a year: 2025
2025 is not a leap year.
*/
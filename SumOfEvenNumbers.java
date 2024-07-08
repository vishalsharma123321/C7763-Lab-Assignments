/*
 ************************************ Second Question  ********************************.
 Q2) Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers.
*/

/*
  Name = VISHAL SHARMA .
*/
import java.util.ArrayList;
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // Calculate the sum of even numbers
        int sum = calculateSumOfEvenNumbers(numbers);

        // Print the sum
        System.out.println("Sum of even numbers: " + sum);
    }

    // Method to calculate the sum of even numbers in an ArrayList
    public static int calculateSumOfEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) { // Check if the number is even
                sum += num;
            }
        }
        return sum;
    }
}
/*
  output.
Sum of even numbers: 30
*/
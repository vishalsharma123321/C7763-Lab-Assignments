/*
 ************************************ Second Question  ********************************.
 Q2)  Create a program with a logic that throws the ArrayIndexOutOfBoundsException while
      accessing elements in an array.[Hint: Use array and loop and try to access the
      element beyond the last index]
 */

/*
  Name = Vishal Sharma.
*/

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            // Trying to access an element beyond the last index
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception occurred!");
        }
    }
}
/*
  Output.
  Array index out of bounds exception occurred!
 */
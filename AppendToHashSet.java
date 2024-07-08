///*
// ************************************ First Question  ********************************.
// Q1) Write a Java program to append the specified element to the end of a HashSet.
//*/
//
///*
//  Name = VISHAL SHARMA .
//*/
//
//import java.util.HashSet;
//import java.util.Stack;
//
//public class AppendToHashSet {
//    public static void main(String[] args) {
//        // Create a HashSet
//        HashSet<String> hashSet = new HashSet<>();
//
//        // Add elements to the HashSet
//        hashSet.add("Apple");
//        hashSet.add("Banana");
//        hashSet.add("Orange");
//
//        // Print the HashSet before appending
//        System.out.println("HashSet before appending: " + hashSet);
//
//        // Append the specified element
//        hashSet.add("Grapes");
//
//        // Print the HashSet after appending
//        System.out.println("HashSet after appending: " + hashSet);
//    }
//}
//
///*
//  output
//HashSet before appending: [Apple, Orange, Banana]
//HashSet after appending: [Apple, Grapes, Orange, Banana]
//*/
//
//
//
//
//
//
//
//
//
///*
// ************************************ Second Question  ********************************.
// Q2) Write a program to declare stack.Store 10 elements into it.Remove 4 elements from
//     stack and display it.
//*/
//
///*
//  Name = VISHAL SHARMA .
//*/
//
//import java.util.Stack;
//public class StackOperations {
//    public static void main(String[] args) {
//        // Declare a Stack
//        Stack<Integer> stack = new Stack<>();
//
//        // Store 10 elements into the stack
//        for (int i = 1; i <= 10; i++) {
//            stack.push(i);
//        }
//
//        // Print the stack before removal
//        System.out.println("Stack before removal: " + stack);
//
//        // Remove 4 elements from the stack and display them
//        for (int i = 0; i < 4; i++) {
//            int removed = stack.pop();
//            System.out.println("Removed: " + removed);
//        }
//
//        // Print the stack after removal
//        System.out.println("Stack after removal: " + stack);
//    }
//}
///*
//  output.
//Stack before removal: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//Removed: 10
//Removed: 9
//Removed: 8
//Removed: 7
//Stack after removal: [1, 2, 3, 4, 5, 6]
//*/
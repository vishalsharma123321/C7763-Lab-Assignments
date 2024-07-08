import java.util.Stack;
public class StackOperations {
    public static void main(String[] args) {
        // Declare a Stack
        Stack<Integer> stack = new Stack<>();

        // Store 10 elements into the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        // Print the stack before removal
        System.out.println("Stack before removal: " + stack);

        // Remove 4 elements from the stack and display them
        for (int i = 0; i < 4; i++) {
            int removed = stack.pop();
            System.out.println("Removed: " + removed);
        }

        // Print the stack after removal
        System.out.println("Stack after removal: " + stack);
    }
}

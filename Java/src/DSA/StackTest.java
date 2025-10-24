package DSA;

public class StackTest {
    public static void main(String[] args) {
        // Create a stack with capacity for 5 elements
        Stack<Integer> stack = new ArrayStack<>(5);

        // Push elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Push another element
        stack.push(40);

        // Display stack size
        System.out.println("Current size: " + stack.size());

        // Pop remaining elements
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}


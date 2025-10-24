package DSA;

/**
 * An interface for a generic Stack data structure.
 * Defines methods for basic stack operations.
 *
 * @param <T> the type of elements held in the stack
 */
public interface Stack<T> {
    /**
     * Pushes an item onto the stack.
     * @param item The item to add
     */
    void push(T item);

    /**
     * Removes and returns the item from the top of the stack.
     * @return The item removed from the top
     */
    T pop();

    /**
     * Returns the item from the top without removing it.
     * @return The item at the top of the stack
     */
    T peek();

    /**
     * Checks if the stack is empty.
     * @return true if stack is empty
     */
    boolean isEmpty();

    /**
     * Returns the current size of the stack.
     * @return Number of elements in the stack
     */
    int size();
}


package DSA;

public class ArrayStack<T> implements Stack<T> {
    private int capacity;
    private T[] stackArr;
    private int top;

    public ArrayStack(int size) {
        capacity = size;
        stackArr = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T item) {
        if (top == capacity - 1) throw new RuntimeException("Stack overflow");
        stackArr[++top] = item;
    }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("Stack underflow");
        return stackArr[top--];
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return stackArr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}


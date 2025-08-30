package programs;

import java.util.Stack;

public class Program27 {
    public static void main(String[] args) {
        Stack<Object> s1 = new Stack<>();

        s1.push(23);
        s1.push(40);
        s1.push(100);
        s1.push(34);
        s1.push(40);
        s1.push(66);
        s1.push(48);

        System.out.println("s1 = " + s1);
        System.out.println("s1.peek() = " + s1.peek());
        System.out.println("s1.search(40) = " + s1.search(40));
        System.out.println("s1.search(23) = " + s1.search(23));
        System.out.println("s1.search(100) = " + s1.search(100));
    }
}

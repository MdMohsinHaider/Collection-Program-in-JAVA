package programs;

import java.util.Set;
import java.util.TreeSet;

public class Program28 {
    public static void main(String[] args) {
        Set<Object> s1 = new TreeSet<>();

        s1.add(34);
        s1.add(55);
        s1.add(34);
        s1.add(12);
        s1.add(45);
        s1.add(44);

        System.out.println("s1 = " + s1);
    }
}

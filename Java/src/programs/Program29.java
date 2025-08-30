package programs;

import java.util.Set;
import java.util.TreeSet;

public class Program29 {
    public static void main(String[] args) {
        Set<Object> s1=new TreeSet<>();

        s1.add("Mohsin");
        s1.add("abc");
        s1.add("Tab");
        s1.add("ddd");
        s1.add("efg");
        s1.add("mac");
        s1.add("A");
        s1.add("a");

        System.out.println("s1 = " + s1);
    }
}

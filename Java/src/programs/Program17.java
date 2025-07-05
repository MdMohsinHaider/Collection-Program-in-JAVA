package programs;

import java.util.ArrayList;
import java.util.List;

public class Program17 {
    public static void main(String[] args) {
        List<Object> l1 = new ArrayList<>();
        l1.add(34);
        l1.add(1,50);
        l1.add(0,55);
        System.out.println("l1 = " + l1);
        l1.add(null);
        l1.add(4,100);
        l1.add(null);
        System.out.println("l1 = " + l1);
    }
}

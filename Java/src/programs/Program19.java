package programs;

import java.util.ArrayList;
import java.util.List;

public class Program19 {
    public static void main(String[] args) {
        List<Object> l1=new ArrayList<>();

        l1.add(34);
        l1.add(45);
        l1.add(50);
        l1.add(100);
        l1.add(70);

        System.out.println("l1 = " + l1);
        System.out.println("l1.get(2) = " + l1.get(2));
        System.out.println("(Integer)l1.get(3) +25 = " + ((Integer)l1.get(3) + 25));
    }
}

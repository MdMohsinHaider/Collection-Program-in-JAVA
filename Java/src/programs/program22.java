package programs;

import java.util.ArrayList;
import java.util.List;

public class program22 {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(34);
        l1.add(45);
        l1.add(50);
        l1.add(100);
        l1.add(70);
        l1.add(45);
        l1.add(20);
        l1.add(45);
        l1.add(55);

        System.out.println("l1.indexOf(50) = " + l1.indexOf(50));
        System.out.println("l1.indexOf(45) = " + l1.indexOf(45));
        System.out.println("l1.indexOf(200) = " + l1.indexOf(200));
        System.out.println("l1.lastIndexOf(45) = " + l1.lastIndexOf(45));
    }
}

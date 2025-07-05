package programs;

import java.util.ArrayList;
import java.util.List;

public class Program18 {
    public static void main(String[] args) {
        List<Object> l1=new ArrayList<>();

        l1.add(34);l1.add(1, 50);
        l1.add(0, 55);
        l1.remove(1);
        l1.add(45);
        l1.add(1, 100);
        l1.remove(2);
        l1.add(2, 70);
        l1.remove(1);

        System.out.println("l1 = " + l1);
    }
}

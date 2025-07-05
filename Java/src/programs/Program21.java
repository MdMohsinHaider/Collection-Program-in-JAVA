package programs;

import java.util.ArrayList;
import java.util.List;

public class Program21 {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        
        l1.add(34);
        l1.add(45);
        l1.add(50);
        l1.add(100);
        l1.add(70);

        for (int i = 0; i <l1.size() ; i++) {
            System.out.println("l1.get(i) = " + l1.get(i));
        }
    }
}

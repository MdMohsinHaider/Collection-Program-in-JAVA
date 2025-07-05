package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Program24 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();

        l1.add(34);
        l1.add(45);
        l1.add(50);
        l1.add(100);
        l1.add(70);
        l1.add(45);

        ListIterator<Integer> listIterator = l1.listIterator(l1.size());
        while (listIterator.hasPrevious()){
            System.out.println("listIterator.previous() = " + listIterator.previous());
        }
    }
}


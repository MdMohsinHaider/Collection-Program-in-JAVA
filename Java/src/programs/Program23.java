package programs;

import java.util.*;

public class Program23 {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();

        l1.add(34);
        l1.add(45);
        l1.add(50);
        l1.add(100);
        l1.add(70);
        l1.add(45);

        ListIterator<Integer> listItr = l1.listIterator();
        Iterator<Integer> itr = l1.iterator();

        while (listItr.hasNext()){
            System.out.println("listItr.next() = " + listItr.next());
        }
        
        while (listItr.hasPrevious()){
            System.out.println("listItr.previous() = " + (listItr.previous()));
        }
    }
}

package programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program12 {
    public static void main(String[] args) {
        Collection<Object> c1 = new ArrayList<>();
        c1.add(23);c1.add(45.6);c1.add("Mohan");
        c1.add(45);c1.add(44.77);c1.add("Sohan");
        c1.add(44);c1.add(57);c1.add(100);c1.add(55);
        c1.add(200);c1.add(45.8);c1.add("John");
        countEvenInteger(c1);
    }

    private static void countEvenInteger(Collection<Object> collection) {
        System.out.println("Before collection = " + collection);
        Iterator<Object> itr = collection.iterator();
        int count = 0;
        while (itr.hasNext()){
            Object o = itr.next();
            if (o instanceof Integer && (Integer) o%2== 0)
                count++;
        }
        System.out.println("Total Even Integer Elements are = " + count);
    }
}

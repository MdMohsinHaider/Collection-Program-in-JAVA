package programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program13 {
    public static void main(String[] args) {
        Collection<Object> c1 = new ArrayList<>();
        c1.add(23);c1.add(45.6);c1.add("Mohan");
        c1.add(45);c1.add(44.77);c1.add("Sohan");
        c1.add(44);c1.add(57);c1.add(100);c1.add(55);
        c1.add(200);c1.add(45.8);c1.add("John");
        sumInteger(c1);
    }

    private static void sumInteger(Collection<Object> collection){
        System.out.println("Before collection = " + collection);
        int sum = 0;
        Iterator<Object> itr = collection.iterator();
        while (itr.hasNext()){
            Object o = itr.next();
            if (o instanceof Integer)
                sum+=(Integer)o;
        }
        System.out.println("Integer sum = " + sum);
    }
}

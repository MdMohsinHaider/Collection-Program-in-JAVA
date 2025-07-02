package programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program11 {
    public static void main(String[] args) {
        Collection<Object> c1=new ArrayList<>();
        c1.add(23);
        c1.add(45.6);
        c1.add("Mohan");
        c1.add(45);
        c1.add(44.77);
        c1.add("Sohan");
        c1.add(44);
        c1.add(57);
        c1.add(100);
        c1.add(55);
        c1.add(200);
        c1.add(45.8);
        c1.add("John");
        countInteger(c1);
    }

    private static void countInteger(Collection<Object> collection){
        int count = 0;
        System.out.println("Before collection = " + collection);
        Iterator<Object> itr = collection.iterator();
        while (itr.hasNext()){
            Object o = itr.next();
            if (o instanceof Integer)
                count++;
        }
        System.out.println("Integer count of = " + count);
    }
}



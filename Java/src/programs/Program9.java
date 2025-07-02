package programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program9 {
    public static void main(String[] args) {
        Collection<Object> c1=new ArrayList<Object>();
        c1.add(23);
        c1.add(45.6);
        c1.add("Mohsin");
        c1.add(45);
        c1.add(44.77);
        c1.add("Haider");
        c1.add(44);
        c1.add(57);
        c1.add(100);
        c1.add(55);
        c1.add(200);
        c1.add(45.8);
        c1.add("Devil");
        removeOther(c1);
    }

    private static void removeOther(Collection<Object> collection){
        System.out.println("Before collection = " + collection);
        Iterator<Object> itr = collection.iterator();
        while (itr.hasNext()){
            Object o = itr.next();
            if (!(o instanceof String))
                itr.remove();
        }
        System.out.println("After collection = " + collection);
    }
}

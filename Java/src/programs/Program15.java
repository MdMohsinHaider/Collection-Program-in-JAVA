package programs;

import java.util.ArrayList;
import java.util.Collection;

public class Program15 {
    public static void main(String[] args) {
        Collection<Object> c1 = new ArrayList<>();
        c1.add("abc");c1.add(45.6);c1.add("Mohan");
        c1.add(45);c1.add(44.77);c1.add("Sohan");
        c1.add(44);c1.add(17);c1.add(100);c1.add(55);
        c1.add(200);c1.add(45.8);c1.add("John");
        printEveryObjectElement(c1);

    }

    private static void printEveryObjectElement(Collection<Object> collection){
        System.out.println("collection = " + collection);
        for (Object o :collection)
            System.out.println("o = " + o);
    }
}

package programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class program8 {
    public static void main(String[] args) {
        Collection<Object> c1=new ArrayList<>();
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
        c1.add((float)45.8);
        c1.add("Devil");
        c1.add('y');
        c1.add('6');
        c1.add(true);
        c1.add(true);
        c1.add(false);
        c1.add((long)123456789);
        c1.add(4);
        c1.add((byte) 12);
        c1.add((byte) 34);
        c1.add((byte) 67);
        c1.add((byte) 127);
        c1.add((short) 34);

//        removeString(c1);
//        removeInteger(c1);
//        removeFloat(c1);
//        removeDouble(c1);
//        removeLong(c1);
//        removeBoolean(c1);
//        removeCharacter(c1);
//        removeByte(c1);
        removeShort(c1);
    }

    private static void removeString(Collection<Object> collection){
        System.out.println("Before collection = " + collection);

        Iterator<Object> itr = collection.iterator();
        while (itr.hasNext()){
            Object object = itr.next();
            if (object instanceof String)
                itr.remove();
        }
        System.out.println("After collection = " + collection);
    }

    private static void removeInteger(Collection<Object> collection){
        System.out.println("Before collection = " + collection);
        Iterator<Object> itr = collection.iterator();
        while (itr.hasNext()){
            Object o = itr.next();
            if (o instanceof Integer)
                itr.remove();
        }
        System.out.println("After collection = " + collection);
    }

    private static void removeFloat(Collection<Object> collection){
        System.out.println("After collection = " + collection);
        Iterator<Object> itr = collection.iterator();
        while (itr.hasNext()){
            Object o = itr.next();
            if (o instanceof Float)
                itr.remove();
        }
        System.out.println("After collection = " + collection);
    }

    private static void removeDouble(Collection<Object> collection){
        System.out.println("Before collection = " + collection);
        Iterator<Object> itr = collection.iterator();
        while (itr.hasNext()){
            Object o = itr.next();
            if (o instanceof Double){
                itr.remove();
            }
        }
        System.out.println("After collection = " + collection);
    }

    private static void removeLong(Collection<Object> collection){
        System.out.println("Before collection = " + collection);
        Iterator<Object> itr = collection.iterator();
        while (itr.hasNext()){
            Object o = itr.next();
            if (o instanceof Long)
                itr.remove();
        }
        System.out.println("After collection = " + collection);
    }

    private static void removeBoolean(Collection<Object> collection){
        System.out.println("Before collection = " + collection);
        Iterator<Object> itr = collection.iterator();
        while (itr.hasNext()){
            Object o= itr.next();
            if (o instanceof Boolean)
                itr.remove();
        }
        System.out.println("After collection = " + collection);
    }

    private static void removeCharacter(Collection<Object> collection){
        System.out.println("Before collection = " + collection);
        Iterator<Object> itr = collection.iterator();
        while (itr.hasNext()){
            Object o = itr.next();
            if (o instanceof Character)
                itr.remove();
        }
        System.out.println("After collection = " + collection);
    }

    private static void removeByte(Collection<Object> collection){
        System.out.println("Before collection = " + collection);
        Iterator<Object> itr = collection.iterator();
        while (itr.hasNext()){
            Object o = itr.next();
            if (o instanceof Byte)
                itr.remove();
        }
        System.out.println("After collection = " + collection);
    }

    private static void removeShort(Collection<Object> collection){
        System.out.println("Before collection = " + collection);
        Iterator<Object> itr = collection.iterator();
        while (itr.hasNext()){
            Object o = itr.next();
            if (o instanceof Short)
                itr.remove();
        }
        System.out.println("After collection = " + collection);
    }
}

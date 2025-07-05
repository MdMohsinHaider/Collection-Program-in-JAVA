package programs;

import java.util.ArrayList;

public class Program25 {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>(10000);
        c1.add(23);
        c1.add(23);
        c1.add(45);
        c1.add(60);
        c1.add(34);

        int sum = 0;
        for (int x : c1)
            sum+=x;
        System.out.println("sum = " + sum);

        System.out.println("c1 = " + c1);

        ArrayList a2 = new ArrayList(c1);
        System.out.println("a2 = " + a2);
    }
}

package programs;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StringCharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s1=sc.nextLine();
        getFrequency(s1);

    }

    private static void getFrequency(String string){
        Set<Character> s1 = new TreeSet<>();

        // insert String Charter One by on in Set
        for (int i = 0; i <string.length() ; i++) {
            char c = string.charAt(i);
            // check space charter
            if (c!=' ')
                s1.add(c);
        }

        // count
        for (char c:s1){
            int count = 0;
            for (int i = 0; i <string.length() ; i++) {
                if (c==string.charAt(i)){
                    count ++;
                }
            }
            System.out.println(c+ " count = " + count);
        }
    }
}

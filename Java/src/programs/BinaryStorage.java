package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryStorage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        getBinary(number);
    }

    private static void getBinary(int num){
        List<Integer> l1 = new ArrayList<>();
        while (num>0){
            l1.add(0,num%2);
            System.out.println("l1 before = " + l1);
            num = num/2;
        }
        System.out.println("l1 = " + l1);
    }
}

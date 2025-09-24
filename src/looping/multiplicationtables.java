package looping;

import java.util.Scanner;

public class multiplicationtables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Start number");
        int start = scan.nextInt();

        System.out.println("Enter End Number");
        int end = scan.nextInt();

        for (int num = start; num < end; num++) {
            for (int i = 1; i < 12; i++) {
                System.out.println(num + "*" + "=" + i + num*1); //3*1=3
            }
            System.out.println();
        }

    }
}

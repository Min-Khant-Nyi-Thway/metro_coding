package looping;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println(" Input the number ");

        int num = scan.nextInt(); 
        
        for (int i = 0; i < 12; i++) {
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}

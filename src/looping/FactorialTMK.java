package looping;

import java.util.Scanner;

public class FactorialTMK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scan.nextInt();

        int facto = 1;

        for (int i = 1; i <= num; i++) {
            facto *= i;
        }
        System.out.println("The factorial of "+ num + " is " + facto);
    }
}

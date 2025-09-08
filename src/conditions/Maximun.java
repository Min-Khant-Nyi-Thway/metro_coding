package conditions;

import java.util.Scanner;

public class Maximun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first numbers: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second numbers: ");
        int num2 = scan.nextInt();
        System.out.println("Enter third numbers: ");

        int num3 = scan.nextInt();
        int max = Integer.MIN_VALUE;

        // int a = 10, b = 20, c = 15;
        // int max;

        if (num1 >= num2 && num1 >= num2) {
            System.out.println(num1 + " is the maximum number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the maximum number.");
        } else {
            System.out.println(num3 + " is the maximum number.");
            
        }

        System.out.println("The maximum value is: " + max);
    }
    
}

package looping;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Input the number: ");
        int number = input.nextInt();

        
        long factorial = 1;

        
        if (number < 0) {
            System.out.println("Factorial of negative numbers doesn't exist.");
        }
        
        else if (number == 0) {
            System.out.println("The Factorial of 0 is: 1");
        }
        
        else {
            for (int i = 1; i <= number; i++) {
                factorial *= i; 
            }
            System.out.println("The Factorial of " + number + " is: " + factorial);
        }

        input.close(); 
    }
}

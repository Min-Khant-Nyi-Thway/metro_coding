package looping;

import java.util.Scanner;

public class Prime_while {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");

        int num = scan.nextInt(); 
        int div = 2;

        while (div < num) {
            
            if(num % div == 0)
                break; //exist while loop
            div++;
        }
        if(num == div)
            System.out.println(num + " is prime number");
        else
            System.out.println(num + " is not Prime Number");


    }
}

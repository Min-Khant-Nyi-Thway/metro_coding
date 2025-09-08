package conditions;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scan.nextInt();

        if(age >= 18) {
            System.out.println( age + " is eligible to vote.");
        } else {
            System.out.println( age + " Not eligible to vote.");
        }
    }
    
}

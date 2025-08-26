package input;

import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");

        int age = scan.nextInt();

        System.out.println("Your age is " + age);

    }
    
}

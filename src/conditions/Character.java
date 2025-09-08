package conditions;

import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter character: ");
        char c = scan.next().charAt(0);

        if (c >=65 && c <= 90 || c >= 97 && c <= 122) {
            System.out.println(c + " is an alphabet.");
        } else if (c >= 48 && c <= 57) {
            System.out.println(c + " is a digit.");
        } else {
            System.out.println(c + " is a special character.");
            
        }

    }
}

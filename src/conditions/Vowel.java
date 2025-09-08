package conditions;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter character: ");
        char c = scan.next().charAt(0);

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            System.out.println(c + " is a vowel.");
        else
            System.out.println(c + " is a consonant.");
    }
}
package conditions;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter character: ");
        char c = scan.next().charAt(0);

        int ascii_value = (int) c;
        System.out.println("The ASCII value of " + c + " is: " + ascii_value);
    }
}

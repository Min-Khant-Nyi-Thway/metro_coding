package looping;

import java.util.Scanner;

public class Fibonnanci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number term: ");

        int num = scan.nextInt();
        int first = 0, second = 1;
        System.out.println("first" + " " + second + " ");

        for (int i = 3; i <= num; i++) {
                int result = first + second;
                System.out.println(result + " "); 

                first  = second;
                second  = result;
        }
    }
}

package looping;
import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");

        int number = scan.nextInt();
        int sum = 0;

       
        while (number != 0) {
            int digit = number % 10;
            sum += digit;           
            number /= 10;           
        }

        System.out.println("The sum of the digits of is: " + sum);

    }
}

package looping;
import java.util.Scanner;

public class OddNumberSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = scan.nextInt();
        int sum = 0;
        System.out.print("The odd numbers are: ");

        for (int i = 1; i <= n; i++) {
            int odd = i*2-1;
            System.out.print(odd + " ");
            sum += odd;    
        }
        System.out.println("\nsum : " + sum);


    }
}

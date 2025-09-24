package looping;
import java.util.Scanner;

public class PyramidStr {

    public static void printPattern(int num) // Argument (method name => printPattern)
    {
        int i, j;        
        
        for (i = 0; i < num; i++) {
            for (j = num - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        // int num = 4;
        // printPattern(num);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Rows Numbers for Pyramid");

        int num = scan.nextInt();
        printPattern(num); 
    }
}

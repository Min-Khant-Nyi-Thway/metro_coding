package looping;
import java.util.Scanner;
public class cube {
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        System.out.println("input number of term: ");

        int n = scan.nextInt(); //5
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Number is : " + i + " and the cube of the " + i + " is : " + i*i*i  ); // i*i*i cube 3 of i
            // System.out.println("Number is : " + i + " and the cube of the " + i + " is : " + Math.pow(i, 3) ); // i*i*i cube 3 of i
        }
    }
}

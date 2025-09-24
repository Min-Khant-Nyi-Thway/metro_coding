package looping;

import java.util.Scanner;

public class rightAngle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
         System.out.println("Enter number of rows");
        

        int rows = scan.nextInt();
        // int num = 1;

        for (int i = 1; i <= rows; i++) {
        
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                // num++; 
            }
            System.out.println(); 
        }

    }
}

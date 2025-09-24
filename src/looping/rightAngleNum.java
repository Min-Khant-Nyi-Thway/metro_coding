package looping;

import java.util.Scanner;

public class rightAngleNum {
    public static void main(String[] args) {

        // i = rows
        // j = columns 

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows");
        

        int rows = scan.nextInt();
        

        for (int i = 1; i <= rows; i++) {
        
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
        
            }
            System.out.println(); 
        }

    }
}

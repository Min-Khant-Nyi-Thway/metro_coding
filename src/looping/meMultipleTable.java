package looping;

import java.util.Scanner; 

public class meMultipleTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter the number for which you want the multiplication table: ");
        int num = input.nextInt(); 

        System.out.println("Multiplication table for " + num + ":");

        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d%n", num, i, num * i); // Print each line of the table
        }

        input.close(); 
    }
}

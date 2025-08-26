package input;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = scan.nextDouble(); 

      
        double area = Math.PI * radius * radius; 

      
        System.out.println("Circle's Area: " + area);

        scan.close(); 
    }
}
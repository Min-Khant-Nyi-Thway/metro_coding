package input;

import java.util.Scanner;

public class TriangleTeacher {
    
 public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("enter base:");

        int base = scan.nextInt();
        System.out.println("Eneter height: ");

        int height = scan.nextInt();
        double area = 0.5 * base * height;
        System.out.println("Triangle's Area:" + area); 

 }

}

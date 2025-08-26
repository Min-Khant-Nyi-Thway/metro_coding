package input;

import java.util.Scanner;

public class CircleTeacher {
    
    public static void main(String[] args) {
     
        final double pi = 3.14;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radious: ");
        double r = scan.nextDouble();
        double area = pi*r*r;

        System.out.println("Circle area: "+ area);

        scan.close();
        
    }

}

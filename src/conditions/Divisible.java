package conditions;

import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter number");

        int input = scan.nextInt();
        
        if(input %5 == 0 && input %3 == 0 )
            System.out.println("both 5 and 3");
        else if(input %5 == 0)
            System.out.println("only 5");
        else if(input %3 == 0)
            System.out.println("only 3");
        else
            System.out.println("not 5 or 3");


     
    
    }

}



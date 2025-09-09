package condition_switch;

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        String redColor = "\u001B[31m";
        String greenColor = "\u001B[32m";
        String resetColor = "\u001B[0m";

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Num 1: ");
        int num1 = scan.nextInt();

        System.out.println("Please Enter Operator");
        char optr = scan.next().charAt(0);
        
        System.out.println("Please enter Num2: ");
        int num2 = scan.nextInt();

        switch (optr) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }


    }
}

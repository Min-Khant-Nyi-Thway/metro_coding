package condition_switch;

import java.util.Scanner;

public class Weekend {
    
    public static void main(String[] args) {
       
        String greenColor = "\u001B[32m";
        String redColor = "\u001B[31m";
        String resetColor = "\u001B[0m";
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Choose Day");

        String day = scan.next();

        switch (day) {
            case "Monday":
                break;
            case "Tuesday":
                break;
            case "Wednesday":
                break;
            case "Thursday":
                break;
            case "Friday":
                System.out.println(greenColor + "Week Day" + resetColor);
                break;
            case "Saturday":
                break;
            case "Sunday":
                System.out.println(redColor + "Week End" + resetColor);
                break;
            default:
                System.out.println("Invalid Day Name");
                break;
        }


    }

}

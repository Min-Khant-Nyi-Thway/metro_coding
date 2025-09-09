package conditions;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Scores");

        int score = scan.nextInt();

        if (score >= 90)
            System.out.println("Grade A");
        else if (score >= 80)
            System.out.println("Grade B");
        else if (score >= 70)
            System.out.println("Grade C");
        else if (score >= 60)
            System.out.println("Grade D");
        else
            System.out.println("Grade E");
        
    }
}

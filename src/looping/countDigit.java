package looping;

import java.util.Scanner;;

public class countDigit {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");

        int num = scan.nextInt();
        int count = 0;

        while (num > 0) {
            count++; //1,2,3,4,5
            num /= 10;//1234,234,12,1,0
        }
        System.out.println("Number of Digits :" + count);
    }
}

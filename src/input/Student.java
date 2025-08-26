package input;

import java.util.Scanner;

public class Student {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter student_Id: ");
        int id = scan.nextInt();
        
        scan.nextLine();

        System.out.println("Enter name: ");
        String name = scan.nextLine();
        
        System.out.println("Enter age: ");
        int age = scan.nextInt();

        System.out.println("Enter address: ");
        String address = scan.next();

        System.out.println("Student ID: "+ id +"\nName: " + name + "\nAge: " + age + "\nAddress: " + address);

    }

}

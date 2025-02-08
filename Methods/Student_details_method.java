package Methods;

//Author: Sharwan jung kunwar
//Purpose: To print student details in formatted form, first take name, age, grade, address then print to the console.

import java.util.Scanner;

public class Student_details_method {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);



        System.out.print("Full Name : ");
        String student_name = scan.nextLine();
        System.out.print("Address : ");
        String address = scan.nextLine();
        System.out.print("Age : ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Class : ");
        String S_class = scan.nextLine();

        studentDetails(student_name,address,S_class,age);



    }
    public static void studentDetails(String name, String address,String S_class, int age)
    {
        System.out.println("\n\nStudent Details\n");
        System.out.println("Name : "+name);
        System.out.println("Address: "+address);
        System.out.println("Age : "+age);
        System.out.println("Class : "+S_class);
        System.out.println();
    }
}

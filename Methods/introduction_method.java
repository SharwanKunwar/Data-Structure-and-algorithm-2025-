package Methods;

//Author: Sharwan jung kunwar
//Purpose: To write a method which can take user_name, address, age. and print the introduction of a person.

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class introduction_method {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        System.out.print("Enter your address : ");
        String address = scan.nextLine();
        System.out.print("Enter your age : ");
        int age = scan.nextInt();

        intro(name,address,age);


    }
    public static void intro(String user_name, String address, int age){
        System.out.println("\n\n--------------------------------------------------");
        System.out.format("Hello, This is %s,\ni live in %s and my age is %d.\nThank you for having me.\n",user_name,address,age);
        System.out.println("--------------------------------------------------\n");
    }
}

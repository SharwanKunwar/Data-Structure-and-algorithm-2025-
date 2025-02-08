package Methods;

//Author: Sharwan jung kunwar
//Purpose: To make a method which greet someone who enter name.

import java.util.Scanner;

public class greet
{
    public static void greet(String name){
        System.out.println("\n\nHello, "+name);
        System.out.println("nice to meet you.\n");
    }

    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String user_name = scan.nextLine();

        greet(user_name);

    }

}

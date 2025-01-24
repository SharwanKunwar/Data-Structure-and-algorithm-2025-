package Loops;

import java.util.Scanner;

//Author: Sharwan jung kunwar
//Purpose: To print n term of even numbers.

public class code05 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        //Taking input from the user.
        System.out.print("Enter your number : ");
        int variable = scan.nextInt();

        //Checking condition
        for(int i=2; i<=2*variable; i+=2){
            System.out.println(i);
        }

        //Closing scaner
        scan.close();

    }
}

package Loops;

//Author: Sharwan jung kunwar
//Purpose: To print the table of 19.

import java.util.Scanner;

public class code02 {
    public static void main(String[] args)
    {
        //Creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = scan.nextInt();

        for(int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n",num,i,i*num);
        }

    }
}

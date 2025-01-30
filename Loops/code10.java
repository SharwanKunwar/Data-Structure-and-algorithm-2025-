package Loops;

import java.util.Scanner;

//Author: Sharwan jung kunwar
//Purpose: To print the factorial of a given number 'n'

public class code10 {
    public static void main(String[] args)
    {
        //Creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        //Prompting and taking input from the user.
        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        long factorial = 1;

        for(int k=2; k<=num; k++){
            factorial *=k;              //1*2 = 2,  2*3 = 6,  6*4 = 24,  24*5 = 120,  120*6 = 720 ; til 'n'
            System.out.println(factorial);
        }

        System.out.format("Factorial of %d is: %d",num,factorial);



        //Closing a scanner
        scan.close();
    }
}

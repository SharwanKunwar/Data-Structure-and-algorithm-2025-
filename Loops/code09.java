package Loops;

//Author: Sharwan jung kunwar
//Purpose: Wap to print the sum of given number and its reverse.

import java.util.Scanner;

public class code09 {
    public static void main(String[] args)
    {
        //Creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        //Prompting
        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        int store_num = num;
        int store_reverse=0;
        int rev=0;

        while(num!=0)
        {
            //find the last digit.
            int ld = num%10;
            //multiply by 10 rev values. which is zero at first rev will be zero
            rev *= 10;
            //added last digit in rev
            rev+=ld;

            store_reverse = rev;

            //This is our condition for loop termination
            num/=10;

        }

        System.out.println("\n\nThe Reverse order is        : "+store_reverse);
        System.out.println("And the sum of (num+rev) is : "+(store_reverse+store_num));

        //closing the scanner
        scan.close();

    }
}

/*
Example:- reverse work flow: for (Num : 234)
rev = 0*10 = 0;
rev = 4
rev = 4*10 = 40;
rev = 40+3 = 43;
rev = 43*10 = 430;
rev = 430+2 = 432    This is our desire output in this case. and then added two values (num+rev) is the our sum.

note: Num%10 will give the last digit of given number.Then we process further.
*/

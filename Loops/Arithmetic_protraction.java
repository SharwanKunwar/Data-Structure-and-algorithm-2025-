package Loops;

//Author: Sharwan jung kunwar
//Purpose: To Print {3,6,9,12,15,18... 'N' } till n term. Without using math (AP) concept. And also with Arithmetic Progression in math

import java.util.Scanner;

public class Arithmetic_protraction {
    public static void main(String[] args)
    {
        //Creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        //Variable declaration
        int first_index = 3;
        int difference = 3;

        System.out.print("Enter your n term : ");
        int variable = scan.nextInt();

        //logic with non-math concept
        for(int i=0; i<variable; i++)
        {
            System.out.print(first_index+" ");
            first_index+=difference;
        }

        System.out.println();

        //Logic with math AP concept
        /*
        so, we have a=3, and d = 3.  an = a+(n-1)*d  = 3+(n-1)*3  = 3+3n-3  = 3-3+3n  = 0+3n = 3n.
         */
        for(int i=3; i<=3*variable; i+=3){
            System.out.print(i+" ");
        }


    }
}

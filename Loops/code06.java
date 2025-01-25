package Loops;

//Author: Sharwan jung kunwar
//Purpose: To print {5,10,15,20,25... 'n'} til term.


import java.util.Scanner;

public class code06 {
    public static void main(String[] args)
    {
        //Creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        //Taking 'n' term from the user with the help of scan object.
        System.out.print("Enter your 'n' term : ");
        int variable = scan.nextInt();

        //Logic for method 01
        for(int i=5; i<=5*variable; i+=5)
        {
            System.out.print(i+" ");
        }

        System.out.println();

        //Logic for method 02
        int first_index=5,difference=5;

        for(int i=0; i<variable; i++)
        {
               System.out.print(first_index+" ");
               first_index+=difference;
        }

        //Closing scan
        scan.close();

    }
}

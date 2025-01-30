package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern which is n^2

/*
        1 2 3 4
        1 2 3 4
        1 2 3 4
 */

import java.util.Scanner;

public class pattern03_withNumbers {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        //Taking input
        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //Logic whatever it called.
        for(int i=0; i<num; i++){                       //Rows
            for(int p=0; p<num; p++){                   //Columns
                System.out.print((p+1)+" ");            //pattern "symbol"
            }
            System.out.println();                       //new line
        }

        //closing scanner
        scan.close();

    }
}

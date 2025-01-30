package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern which is n^2

/*
    * * * *
    * * * *
    * * * *
*/

import java.util.Scanner;

public class pattern02_square {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

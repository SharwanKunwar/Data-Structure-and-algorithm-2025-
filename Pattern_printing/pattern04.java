package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern which is n^2 times

/* Ex: - for: 3
        1 1 1
        2 2 2
        3 3 3

 */

import java.util.Scanner;

public class pattern04 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        //Taking input
        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //Logic whatever it called.
        for(int i=0; i<num; i++)
        {
            for(int j=0; j<num; j++)
            {
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }

        //closing scanner
        scan.close();

    }
}

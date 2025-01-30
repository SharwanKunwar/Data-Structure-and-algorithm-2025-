package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern which is n^2 times

/* Ex: - for: 4
                    A B C D
                    A B C D
                    A B C D

 */

import java.util.Scanner;

public class pattern05 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        //Taking input
        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //Logic whatever it called.
        for(int i=1; i<=num; i++){
            for(int j=65; j<65+num; j++)
            {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }

        //closing scanner
        scan.close();

    }
}

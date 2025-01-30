package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

/* Ex: - for: 4
                    A A A A
                    2 2 2
                    C C
                    4
 */

import java.util.Scanner;

public class pattern012 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        //Taking input
        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //Logic whatever it called.
        for(int i=1; i<=num; i++)
        {

            if(i%2 != 0)
            {
                for(int k=i; k<=num; k++){
                    System.out.print((char)(i+64)+" ");
                }
            }
            else
            {
                for(int j=i; j<=num; j++){
                    System.out.print(i+" ");
                }
            }

            System.out.println();
        }



        //closing scanner
        scan.close();

    }
}

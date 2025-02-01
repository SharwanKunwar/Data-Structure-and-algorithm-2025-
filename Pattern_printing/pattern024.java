package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

/* Ex: - for: 4
                    0  0  0  A
                    0  0  A  B
                    0  A  B  C
                    A  B  C  D

 */

import java.util.Scanner;

public class pattern024 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //closing scan
        scan.close();

        //logic
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=num-i; j++)
            {
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print((char)(k+64)+" ");
            }
            System.out.println();
        }
    }
}

package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

/* Ex: - for: 5
                        *
                        *
                    * * * * *
                        *
                        *

 */

import java.util.Scanner;

public class pattern016_plus {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //logic
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=num; j++)
            {
                if((i == (num/2)+1) || (j == (num/2)+1)) System.out.print("* ");
                    else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

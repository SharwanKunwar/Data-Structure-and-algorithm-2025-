package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

/* Ex: - for: 4
                    0        0
                    0  0  0  0
                    0  0  0  0
                    0        0

 */

import java.util.Scanner;

public class pattern021 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //closing scan
        scan.close();

        if(num%2 != 0) num++;

        //logic
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=num; j++)
            {
                if((j==1 || j== num) || (i == (num/2) || i== (num/2)+1)) System.out.print("X ");
                else System.out.print("  ");
            }
            System.out.println();
        }


    }
}

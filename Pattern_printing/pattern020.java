package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

/* Ex: - for: 4
                    0  0  0  1
                    0  0  1  2
                    0  1  2  3
                    1  2  3  4

 */

import java.util.Scanner;

public class pattern020 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //logic
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=num-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();

        }

    }
}

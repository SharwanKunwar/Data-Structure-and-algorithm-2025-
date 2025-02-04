package Demo_code;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

/* Ex: - for: 4
                            *
                          * * *
                        * * * * *
                      * * * * * * *
 */

import java.util.Scanner;

public class code06 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //logic
        for(int i=1; i<=num; i++){
            for(int s=1; s<=i; s++){
                System.out.print("  ");
            }
            for(int j=2; j<=(2*num-i)-i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}

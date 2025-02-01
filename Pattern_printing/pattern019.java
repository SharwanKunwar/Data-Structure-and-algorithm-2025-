package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

/* Ex: - for: 4
                           *
                         * *
                       * * *
                     * * * *
 */

import java.util.Scanner;

public class pattern019
{
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
            for(int j=1; j<=num; j++){
                if((i+j) > num){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}


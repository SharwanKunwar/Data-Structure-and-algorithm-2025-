package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

/* Ex: - for: 4
                    * * * *
                    * * *
                    * *
                    *
 */

import java.util.Scanner;

public class pattern011 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        //Taking input
        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //Logic whatever it called.
        for(int i=1; i<=num; i++){
            for(int j=i; j<=num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }



        //closing scanner
        scan.close();


    }
}

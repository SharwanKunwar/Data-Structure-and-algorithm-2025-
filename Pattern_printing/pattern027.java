package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

/* Ex: - for: 4
                    *
                  * * *
                * * * * *
              * * * * * * *
                * * * * *
                  * * *
                    *

 */

import java.util.Scanner;

public class pattern027 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //logic
        for(int i=1; i<=num; i++){
                for(int space=1; space<=num-i; space++){
                    System.out.print("  ");
                }
                for(int pattern=1; pattern<=2*i-1; pattern++){
                    System.out.print("* ");
                }

            System.out.println();
        }

        for(int i=num-1; i>=1; i--){
            for(int k=1; k<=num-i; k++){
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

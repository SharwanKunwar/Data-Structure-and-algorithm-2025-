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

public class method_another {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter your size : ");
        int num = scan.nextInt();

        int space = num-1;
        int nts =1;

        //logic
        for(int i=1; i<=num; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=nts; k++){
                System.out.print("* ");
            }
            space--;
            nts+=2;
            System.out.println();
        }




    }
}

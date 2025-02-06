package Demo_code;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

/* Ex: - for: 4
                    *  *  *  *
                    0  *  *  *
                    0  0  *  *
                    0  0  0  *

 */

import java.util.Scanner;

public class code09 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //variable declaration
        int space = 1;
        int P_P = num;

        //logic
        for(int i=1; i<=num; i++){
            for(int j= 1; j<=space; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=P_P; k++){
                System.out.print("* ");
            }
            space++;
            P_P--;
            System.out.println();
        }

    }
}

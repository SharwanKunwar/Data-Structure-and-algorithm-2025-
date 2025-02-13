package Demo_Jpt_code;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

/* Ex: - for: 4
                    1
                    0 1
                    1 0 1
                    0 1 0 1
 */

import java.util.Scanner;

public class code01 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //Logic
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                if((i%2 == 0 && j%2 == 0)|| (i%2 != 0 && j%2 != 0)) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }

    }

}

package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

/* Ex: - for: 4
                    1
                    1 3
                    1 3 5
                    1 3 5 7

 */

import java.util.Scanner;

public class pattern013 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //logic
        for(int i=1; i<=num; i++)
        {
           for(int j=1; j<=i; j++){
               System.out.print(2*j-1+" ");

           }
            System.out.println();
        }

    }
}

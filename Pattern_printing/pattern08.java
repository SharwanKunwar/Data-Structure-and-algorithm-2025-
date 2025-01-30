package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

/* Ex: - for: 4
                    1
                    1 2
                    1 2 3
                    1 2 3 4

 */

import java.util.Scanner;

public class pattern08 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        //Taking input
        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //Logic whatever it called.
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }



        //closing scanner
        scan.close();

    }
}

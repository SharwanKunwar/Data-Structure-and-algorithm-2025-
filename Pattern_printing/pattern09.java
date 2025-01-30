package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

/* Ex: - for: 4
                    A
                    A  B
                    A  B  C
                    A  B  C  D

 */

import java.util.Scanner;

public class pattern09 {
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
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }



        //closing scanner
        scan.close();

    }
}

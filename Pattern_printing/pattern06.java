package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern which is n^2 times

/* Ex: - for: 4
                    A  A  A  A
                    B  B  B  B
                    C  C  C  C
                    D  D  D  D

 */

import java.util.Scanner;

public class pattern06 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        //Taking input
        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //Logic whatever it called.
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                System.out.print((char)(i+64)+"  ");
            }
            System.out.println();
        }



        //closing scanner
        scan.close();

    }
}

package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

/* Ex: - for: 5
                    X           X
                       X     X   
                          X      
                       X     X  
                    X           X


 */

import java.util.Scanner;

public class pattern018 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter pattern size : ");
        int size = scan.nextInt();


        //logic
        for(int i=1; i<=size; i++)
        {
            for(int j=1; j<=size; j++)
            {
                if(i == (size+1)-j || i== j) System.out.print("X ");
                else System.out.print("  ");
            }
            System.out.println();
        }

        //closing scan
        scan.close();

    }
}

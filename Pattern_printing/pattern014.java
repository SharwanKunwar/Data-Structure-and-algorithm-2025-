package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

/* Ex: - for: 4
                    1
                    2 3
                    4 5 6
                    7 8 9 10
 */

import java.util.Scanner;

public class pattern014 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        int a=0;

        //logic
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(++a +"  ");
                if(a<10) System.out.print(" ");
            }
            System.out.println();
        }

    }
}

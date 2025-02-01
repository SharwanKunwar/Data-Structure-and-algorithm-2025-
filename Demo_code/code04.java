package Demo_code;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

/* Ex: - for: 4
                        1
                      1 2 3
                    1 2 3 4 5
                  1 2 3 4 5 6 7

 */

import java.util.Scanner;

public class code04 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //logic
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=num-i; j++){
                System.out.print("  ");
            }
            for(int p=1; p<=2*i-1; p++){
                System.out.print((char)(p+64)+" ");
            }
            System.out.println();
        }

    }
}

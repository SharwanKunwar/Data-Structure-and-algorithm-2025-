package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

import java.util.Scanner;

/* Ex: - for: 4
                    0  0  0  4
                    0  0  3  4
                    0  2  3  4
                    1  2  3  4

 */
public class pattern022 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //logic
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=num; j++)
            {
                if((i+j)>num) System.out.print(j+" ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}

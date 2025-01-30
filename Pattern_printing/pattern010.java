package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: Print the given pattern.

/* Ex: - for: 5
                    1
                    A B
                    1 2 3
                    A B C D
                    1 2 3 4 5

 */

import java.util.Scanner;

public class pattern010 {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        //Taking input
        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //Logic whatever it called.
        for(int i=1; i<=num; i++){

            if(i%2 == 0){
                for(int k=1; k<=i; k++){
                    System.out.print((char)(k+64)+" ");
                }
            }else{
                for(int j=1; j<=i; j++){
                    System.out.print(j+" ");
                }

            }
            System.out.println();
        }



        //closing scanner
        scan.close();

    }
}

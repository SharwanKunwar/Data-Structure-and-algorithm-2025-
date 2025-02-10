package Methods;

//Author: Sharwan jung kunwar
//Purpose: To print pascal triangle using method.

import java.util.Scanner;

public class Pascal_triangle
{
    public static void PT(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        PT(num);

    }
}

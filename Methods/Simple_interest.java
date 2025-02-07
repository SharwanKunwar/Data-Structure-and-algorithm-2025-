package Methods;

//Author: Sharwan jung kunwar
//Purpose: To calculate simple interest using method.

import java.util.Scanner;

public class Simple_interest
{
    public static int SI(int p, int t , int r){
        return (p*t*r)/100;
    }

    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Principle : ");
        int p = scan.nextInt();

        System.out.print("Enter your Rate : ");
        int r = scan.nextInt();

        System.out.print("Enter your Time : ");
        int t = scan.nextInt();

        int result_si = SI(p,t,r);

        System.out.println("Your simple interest is : "+result_si);

    }
}

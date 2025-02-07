package Methods;

//Author: Sharwan jung kunwar
//Purpose: To find greatest between four given integers using built-in function in method.

import java.util.Scanner;

public class greatest_between_four_int {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your 1st Num : ");
        int num01 = scan.nextInt();
        System.out.print("Enter your 2nd Num : ");
        int num02 = scan.nextInt();
        System.out.print("Enter your 3rd Num : ");
        int num03 = scan.nextInt();
        System.out.print("Enter your 4th Num : ");
        int num04 = scan.nextInt();

        int compare_result = compare_integers(num01,num02,num03,num04);

        System.out.println("\nThe final compare result is : "+compare_result+ "\nand this is the greatest number\namong given 4 integers");


    }
    public static int compare_integers(int n1, int n2, int n3, int n4){
        return (int) Math.max(n1,(int) Math.max(n2,(int)Math.max(n3,n4)));
    }
}

package Loops;

//Author: Sharwan jung kunwar
//Purpose: To Display this AP : (4,7,10,13,16... upto 'n' terms.

import java.util.Scanner;

public class code04 {
    public static void main(String[] args)
    {
        //Creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your 'n' term : ");
        int num = scan.nextInt();

        for(int i=4; i<=3*num+1; i+=3){
            System.out.println(i);
        }

    }
}

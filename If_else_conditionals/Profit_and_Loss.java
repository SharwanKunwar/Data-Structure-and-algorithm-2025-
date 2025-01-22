package If_else_conditionals;

/*
Author: Sharwan jung kunwar
Problem: If cost price and selling price of an item is input through the keyboard,
         write a program to determine whether the seller has made profit or incurred loss.
         Also determine how much profit he made or loss he incurred.
*/

import java.util.Scanner;

public class Profit_and_Loss {
    public static void main(String[] args)
    {
        //Creating a Scanner object to take input from the user.
        Scanner Take = new Scanner(System.in);

        //Variable declaration
        float CP,SP;
        float Difference;

        //Taking cost price and selling price
        System.out.print("Enter Cost Price : ");
        CP = Take.nextFloat();
        System.out.print("Enter Selling price : ");
        SP = Take.nextFloat();

        // Calculate the difference between CP and SP
        Difference = SP-CP;

        //Determine profit or loss
        if(Difference > 0){
            System.out.println("\nProfit : "+Difference);
        }else if(Difference < 0){
            System.out.println("\nLoss : "+Math.abs(Difference));
        }else{
            System.out.println("\nNeither Loss Nor Profit.");
        }


        //Closing the Scanner
        Take.close();

    }
}

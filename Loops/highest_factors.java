package Loops;

import java.util.Scanner;

//Author: Sharwan jung kunwar
//Purpose: To Print highest factor of a given number.

public class highest_factors {
    public static void main(String[] args)
    {
        // Creating a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        // Variable to keep track of the highest factor found
        int track_factor = 0;

        // Loop to find the highest factor of the given number
        for(int i=num-1; i>=1; i--){
            // Check if 'i' is a factor of 'num'
            if(num%i == 0){
                // Update track_factor with the highest factor found
                track_factor=i;
                // Exit the loop once the highest factor is found
                break;
            }
        }
        // Printing the highest factor found
        System.out.println(track_factor);

        //Closing scan
        scan.close();
    }
}

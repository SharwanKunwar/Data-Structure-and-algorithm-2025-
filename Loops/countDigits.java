package Loops;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter your digits: ");
        int digits = scan.nextInt(); // Read the input integer

        //if given number is 0 then print 1 return;


        int count = 0; // Initialize a counter to count the digits

        if(digits == 0){
            count++;
        }

        // Loop until the number becomes 0
        while (digits != 0) {
            digits = digits / 10; // Remove the last digit of the number
            count++; // Increment the digit counter
        }

        // Print the total count of digits
        System.out.println(count);

        // Close the scanner to release system resources
        scan.close();
    }
}

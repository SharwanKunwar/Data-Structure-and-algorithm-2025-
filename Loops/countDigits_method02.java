package Loops;

import java.util.Scanner;

public class countDigits_method02 {
    public static void main(String[] args)
    {
        // Creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        // Asking the user to input a string of digits.
        System.out.print("Enter your Digits: ");
        String digits = scan.next();

        // Calculating the length of the string, which gives the number of digits.
        int count = digits.length();

        // Outputting the total number of digits.
        System.out.println("The number of digits is: " + count);

        // Closing the scanner to avoid resource leak.
        scan.close();
    }
}

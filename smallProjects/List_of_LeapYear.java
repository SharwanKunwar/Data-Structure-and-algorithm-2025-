package smallProjects;

import java.util.Scanner;

public class List_of_LeapYear {
    public static void main(String[] args)
    {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        int f_Year; // Start year
        int l_Year; // End year

        // Introduction and user prompt
        System.out.println("==== Leap Year List Generator ====");
        System.out.println("Enter the range of years to display the leap years.");
        System.out.println("For example: Start Year = 2000, End Year = 2030\n");

        // Input: Start year
        System.out.print("Enter Start Year: ");
        f_Year = sc.nextInt();

        // Input: End year
        System.out.print("Enter End Year: ");
        l_Year = sc.nextInt();

        // Validate input (optional but recommended)
        if (f_Year > l_Year) {
            System.out.println("\nInvalid input! Start year must be less than or equal to End year.");
            return;
        }

        // Output: Display leap years in the range
        System.out.println("\n=== Leap Years from " + f_Year + " to " + l_Year + " ===");
        boolean found = false; // To check if any leap year is found
        for (int i = f_Year; i <= l_Year; i++) {
            // Check leap year condition
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                System.out.println(i); // Print the leap year
                found = true;
            }
        }

        // If no leap year is found
        if (!found) {
            System.out.println("No leap years found in the given range.");
        }

        // Close the scanner
        sc.close();
    }
}

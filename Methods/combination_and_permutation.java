package Methods;

// Author: Sharwan Jung Kunwar
// Purpose: To take two numbers as input and find their combination and permutation using methods.

import java.util.Scanner;

public class combination_and_permutation
{

    // Helper method it helps to calculate factorial of given number.
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args)
    {
        // Creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your n: ");
        int n = scan.nextInt();

        System.out.print("Enter your r: ");
        int r = scan.nextInt();

        //handling invalid input when given r in greater than n.
        if (r > n) {
            System.out.println("Invalid input! r should be less than or equal to n.");
        } else {
            int resultCombination = combination(n, r);
            System.out.println("Combination (C(n, r)): " + resultCombination);

            int resultPermutation = permutation(n, r);
            System.out.println("Permutation (P(n, r)): " + resultPermutation);
        }

        //closing the scanner good practice. to save memory
        scan.close();
    }
    // Method to calculate Combination: C(n, r) = n! / (r! * (n-r)!)
    public static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // Method to calculate Permutation: P(n, r) = n! / (n-r)!
    public static int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }
}

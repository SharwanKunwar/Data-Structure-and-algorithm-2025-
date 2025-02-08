package Methods;

//Author: Sharwan jung kunwar
//Purpose: Question: Write a Java method that takes an integer as a parameter and returns true if the number is a prime number, otherwise returns false.

import java.util.Scanner;

public class True_if_prime_method {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        boolean result = check(num);

        System.out.println("status: "+result);
    }
    public static boolean check(int x){
        boolean condition = true;

        for(int i=2; i<x; i++){
            if (x % i == 0) {
                condition = false;
                break;
            }
        }


        return condition;
    }
}

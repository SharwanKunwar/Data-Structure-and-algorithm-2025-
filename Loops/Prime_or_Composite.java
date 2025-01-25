package Loops;

import java.util.Scanner;

public class Prime_or_Composite {
    public static void main(String[] args)
    {
        //Creating a scanner object to read input from the user.
        Scanner scan = new Scanner(System.in);

        //Prompting the user to enter a number.
        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        //closing the scaner
        scan.close();


        //Variable to track the number of factors.
        int track_factor = 0;

        //Loop to count the number of factors.
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0){
                track_factor++;
            }
        }

        //If there are 3 or more factors, it is a composite number. Otherwise, it is a prime number.
        if(track_factor >= 3)
        {
            System.out.println("composite");
        }
        else if(track_factor == 1) {
            System.out.println("Neither Prime nor Composite.");
        }else{
            System.out.println("prime");
        }

        //Calling the second method to check if the number is prime or composite.
        Prime_or_composite(num);


    }

    //Function for checking if a given number is prime or composite.
    public static void Prime_or_composite(int num)
    {
        if(num == 1){
            System.out.println("Neither Prime nor Composite.");
            return;
        }
        boolean tracker = false;

        //Loop to check if the number has any divisors other than 1 and itself.
        for(int i = 2; i < num; i++)
        {
            if(num % i == 0){
                tracker = true;
                break;
            }
        }

        //If it has other divisors, it is a composite number. Otherwise, it is a prime number.
        if(tracker)
        {
            System.out.println("It is a composite number.");
        }else {
            System.out.println("It is a prime number.");
        }
    }
}

package If_else_conditionals;

import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        //making scanner object
        Scanner sc = new Scanner(System.in);

        //making variable for user input
        int num;

        //Taking input from the user with the help of scanner object sc
        System.out.print("Enter your number : ");
        num = sc.nextInt();

        // Checking if the number is even or odd
        if(num%2 == 0){
            System.out.format("%d is Even number.",num);
        }else{
            System.out.format("%d is Odd number.",num);
        }


    }
}

//Key Parts:
//1. Uses a Scanner to accept input from the user.
//2. Applies the modulo operator % to check divisibility by 2.
//3. Outputs whether the number is even or odd using conditional statements.


//Summary:
//This Java program reads an integer from the user and checks if it is even or odd.
// If divisible by 2, it is even; otherwise, it is odd.
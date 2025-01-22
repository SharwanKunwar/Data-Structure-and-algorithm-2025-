package If_else_conditionals;

import java.util.Scanner;

//Author: Sharwan jung kunwar
//Purpose: To check the given number is divisible by 5 or not.

public class Divisibility_Test {
    public static void main(String[] args) {
        //Creating a scanner object
        Scanner Take = new Scanner(System.in);

        //Creating variable to store input
        int num;

        //Taking input from the user with the help of scanner object
        System.out.print("Enter your number : ");
        num = Take.nextInt();


        //Checking the number is divisible by 5 or not
        if(num%5 == 0){
            System.out.format("%d is divisible by 5.",num);
        }else{
            System.out.format("%d is not divisible by 5.",num);
        }
    }
}

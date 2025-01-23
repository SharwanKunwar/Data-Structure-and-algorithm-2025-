package If_else_conditionals;

import java.util.Scanner;

public class DivisibleBy_5_and_3 {
    public static void main(String[] args)
    {
        //Creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int variable = scan.nextInt();

        if(variable%5 == 0 && variable%3 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}

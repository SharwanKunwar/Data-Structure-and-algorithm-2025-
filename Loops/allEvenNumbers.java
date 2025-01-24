package Loops;

import java.util.Scanner;

public class allEvenNumbers {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int variable = scan.nextInt();


            for(int i=2; i<=variable; i+=2){
                System.out.println(i);
            }



    }

}

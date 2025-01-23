package If_else_conditionals;

import java.util.Scanner;

public class Greatest_of_three {
    public static void main(String[] args)
    {
        //Creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your num01 : ");
        int num01 = scan.nextInt();

        System.out.print("Enter your num02 : ");
        int num02 = scan.nextInt();

        System.out.print("Enter your num03 : ");
        int num03 = scan.nextInt();

        System.out.println();
        if(num01 > num02 && num01 > num03){
            System.out.println("Num01 is greater.");
        }else if(num02 > num01 && num02 > num03){
            System.out.println("Num02 is greater.");
        }else if(num03 > num02 && num03 > num01){
            System.out.println("Num03 is greater");
        }else{
            System.out.println("Num01 = Num02 = Num03.");
        }


    }
}

package Methods;

//Author: Sharwan jung kunwar
//Purpose: To swap two variable takin user input two variable using method and swap their values without using third variable.

import java.util.Scanner;

public class Swap_variable {
    static int a,b;
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your a : ");
         a = scan.nextInt();
        System.out.print("Enter your b : ");
         b = scan.nextInt();

        System.out.println("Value of a : " +a+ " Value of b : " +b+ " before swap");
        swap(a,b);
        System.out.println("Value of a : " +a+ " Value of b : " +b+ " after swap");

    }
    public static void swap(int x, int y){
        a = y;
        b=x;
    }
}

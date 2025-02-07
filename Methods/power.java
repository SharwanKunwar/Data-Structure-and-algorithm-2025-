package Methods;

//Author: Sharwan jung kunwar
//Purpose: write a program which is calculated n power n by using method.

import java.util.Scanner;

public class power {

    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        System.out.print("Enter your power : ");
        int pow = scan.nextInt();


        int result = pow(num,pow);

        System.out.format("The %d^%d is : %d\n",num,pow,result);



    }
    public static int pow(int x, int y){
        int pow = 1;
        for(int i=1; i<=y; i++){
            pow*=x;
        }
        return pow;
    }
}

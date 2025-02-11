package Methods;

//Author: Sharwan jung kunwar
//Purpose: To print pascal triangle using method.

import java.util.Scanner;

public class Pascal_triangle
{
    public static void PT(int num)
    {
        int pattern_value;

        for(int i=0; i<=num; i++){
            for(int k=1; k<=num-i; k++){
                System.out.print("  ");
            }
            for(int j=0; j<=i; j++){
                pattern_value = fact(i)/(fact(j)*fact(i-j));
                System.out.print(pattern_value+"   ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        PT(num);

    }
    public static int fact(int x){
        int factorial =1;
        for(int i=2; i<=x; i++){
            factorial*=i;
        }
        return factorial;
    }
}

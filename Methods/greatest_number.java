package Methods;

//Author: Sharwan jung kunwar
//Purpose: To find greatest number among three given numbers using predefined method.

import java.util.Scanner;

public class greatest_number {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number : ");
        int first = scan.nextInt();

        System.out.print("Enter your Second number : ");
        int second = scan.nextInt();

        System.out.print("Enter your Third number : ");
        int third = scan.nextInt();


        int result = compare(first,second,third);

        System.out.println("The max of given three number is : "+result);
        System.out.println();
        int second_result = compare01(first,second,third);
        System.out.println("Second output : "+second_result);

    }
    public static int compare(int x, int y, int z){
        int result = Math.max(x,y);
        return (int) Math.max(result,z);
    }
    public static int compare01(int num1, int num2, int num3){
        int greatest=0;

        if(num1 > num2 && num1 >num3){
            greatest = num1;
        }else if(num2 > num1 && num2 > num3){
            greatest = num2;
        }
        else if(num3 > num1 && num3 > num2){
            greatest = num3;
        }else{
            System.out.println("This is not a number (integer)");
        }
        return greatest;
    }
}

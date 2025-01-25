package Loops;

//Author: Sharwan jung kunwar
//Purpose:  Display this GP : {1,2,4,8,16...} upto 'n' terms.

import java.util.Scanner;

public class Geometric_Progressions01 {
    public static void main(String[] args)
    {
        //Creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        //Variable declaration
        int first_term = 5;
        int ratio = 3;

        System.out.print("Enter your 'N' term : ");
        int num = scan.nextInt();


        //Logic for GP without using math formula
        for(int i=0; i<num; i++){
            System.out.print(first_term+" ");
            first_term*=ratio;
        }



        System.out.println();
        int power = num-1;
        double formula = Math.pow(5,power);



        //Logic for GP using math formula
        for(int i=5; i<=formula; i*=3){
            System.out.print(i+" ");
        }

        //closing scan
        scan.close();

    }
}

//note: for GP FORMULA
//formula An = a.r^(n-1);
//formula An = first_term*ratio(num-1);
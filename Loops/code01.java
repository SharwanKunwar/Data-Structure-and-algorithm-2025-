package Loops;

//Author: Sharwan jung kunwar
//Purpose: To print all the numbers from 1 to 100 which are divisible by 3.

import java.util.Scanner;

public class code01 {
    public static void main(String[] args)
    {

        //Variable declaration and initialization
        int range = 100;

        //checking condition
        for(int i=1; i<=range; i++){
            if(i%3 == 0) System.out.println(i);

        }

    }
}

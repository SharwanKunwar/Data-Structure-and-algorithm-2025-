package Loops;

//Author: Sharwan jung kunwar
//Purpose: To WAP to find the highest factor of a number 'n' (other than n itself)

import java.util.Scanner;

public class Brake_in_Loop_01 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        int track_factor = 0;

        for(int i=1; i<num; i++)
        {
            if(num%i == 0){
                System.out.print(i+" ");
                if(i > track_factor){
                    track_factor=i;
                }
            }



        }
        System.out.format("\nThe highest factor of %d is : %d\n",num,track_factor);

    }
}

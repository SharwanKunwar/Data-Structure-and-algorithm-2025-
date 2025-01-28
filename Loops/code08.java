package Loops;

import java.util.Scanner;

public class code08 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num : ");
        int num = scan.nextInt();

        int sum = 0;

        while(num!= 0){
            int ld = num%10;
            if(ld%2 == 0){
                sum+=ld;
            }
            num/=10;
        }
        System.out.println(sum);

    }
}

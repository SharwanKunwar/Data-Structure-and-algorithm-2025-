package If_else_conditionals;

//Author: Sharwan jung kunwar
//Purpose: To find the given year is lead year or not.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)
    {
        //Making variable to store using input.
        int year;

        //Making a Scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        //Taking input from the user
        System.out.print("Enter your year : ");
        year = scan.nextInt();

        if((year%4 ==0 && year%100 != 0)|| year%400 ==0){
            System.out.format("%d This year is lead year.",year);
        }else{
            System.out.format("%d This year is not a lead year.",year);
        }


    }
}

//What is a Leap Year?
//A leap year is a year that has 366 days instead of the usual 365.
// The extra day is added to February, making it 29 days long.
// Leap years help synchronize the calendar year with the solar year.

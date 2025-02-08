package Methods;

//Author: Sharwan jung kunwar
//Purpose:  Create a Java method that accepts a string and returns the string reversed.

import java.util.Scanner;

public class Reverse_string_method
{
    public static String reversed_string(String some){
        StringBuilder f = new StringBuilder(some);
        return f.reverse().toString();

    }

    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your string : ");
        String word = scan.nextLine();

//        String result = reversed_string(word);
        String result = U_reverse(word);

        System.out.println(result);

    }
    //user-define method for revers
    public static String U_reverse(String x)
    {

        if(x.isEmpty())
        {
            System.out.println("There is no string to reverse");
            return x;
        }
        //variable for storing reversed string
        String Final_Result = "";

        //logic
        for(int i=x.length()-1; i>=0; i--)
        {
            Final_Result += x.charAt(i);
        }

        return Final_Result;
    }


}

package Pattern_printing;

//Author: Sharwan jung kunwar
//Purpose: To Print the given pattern. By using user input
/*
 * * * * *
 * * * * *
 * * * * *
 */

import java.util.Scanner;

public class code01_userInput {
    public static void main(String[] args)
    {
        //creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        //Taking input for row value
        System.out.print("Row : ");
        int Row_num = scan.nextInt();

        //Taking input for column value
        System.out.print("Column : ");
        int Column_num = scan.nextInt();

        //Logic or process
        for(int f=0; f<Row_num; f++){
            for(int k=0; k<Column_num; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //closing a scanner
        scan.close();

    }
}

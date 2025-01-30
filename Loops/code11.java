package Loops;

//Author: Sharwan jung kunwar
//Purpose: To Print all the ASCII values and their equivalent characters of 26 alphabets using a while loop.

public class code11 {
    public static void main(String[] args)
    {
        char ch;

        int i=65;
        System.out.println("Uppercase Letters (A-Z)\n");
        while(i<=90){
            if(i==65){
                System.out.println("Letter\t\tASCII value");
            }
            System.out.format("  %c\t\t\t\t%d\n",(char)i,i);
            i++;
        }

        System.out.println("\n\nLowercase Letters (a-z)\n");
        int j = 97;
        while(j<=122){
            if(j==97){
                System.out.println("Letter\t\tASCII value");
            }
            System.out.format("  %c\t\t\t\t%d\n",(char)j,j);
            j++;
        }


    }
}

package Methods;

//Author: Sharwan jung kunwar
//Purpose: To Demonstrate method how it is work.

public class Demo_method {
    public static void display(){
        System.out.println("hey, buddy!");
    }
    public static void main(String[] args)
    {
        System.out.println("This is something 01");     //This will print first
        display();                                      //Then it will call the method to print the output
        System.out.println("This is something 02");     //Then last it will print on the console

    }
}

// so the output is:
//This is something 01
//hey, buddy!
//This is something 02
package Methods;

//Author: Sharwan jung kunwar
//Purpose: To method from method call.

import java.util.Scanner;

public class method_in_method
{
    public static void method02(){
        some();
        System.out.println("this is method 02");
    }
    public static void main(String[] args)
    {
        method0005();

    }
    public static void method01(){
        System.out.println("This is method 01");
        method02();
    }
    public static void method0005(){
        System.out.println("This is method 00000005");
        method01();
    }
    public static void some(){
        System.out.println("Hey, i am some.");
    }
}

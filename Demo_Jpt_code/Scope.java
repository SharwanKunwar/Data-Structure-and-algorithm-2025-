package Demo_Jpt_code;

//Author: Sharwan jung kunwar
//Purpose: To demonstrate how local and global variable works.

public class Scope
{
    static int num;
    public static void main(String[] args)
    {
        num = 60;
        System.out.println(num);
        int num = 22;
        System.out.println(num);
        method();
        System.out.println(num);


    }
    public static void method(){
        System.out.println(num);
        int num = 44;
        System.out.println(num);
    }
}


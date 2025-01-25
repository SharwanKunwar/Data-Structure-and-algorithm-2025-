package Loops;

//Author: Sharwan jung kunwar
//Purpose: To Print all natural upto 100. excluding 50 and 78

public class ContinueStatement {
    public static void main(String[] args)
    {
//        for(int i=1; i<=100; i++){
//            if(i==50 || i==78){
//                continue;
//            }
//            System.out.println(i);
//        }

        evenNumbers();

    }
    public static void evenNumbers(){
        for(int i=2; i<=20; i++){
            if(i%2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}

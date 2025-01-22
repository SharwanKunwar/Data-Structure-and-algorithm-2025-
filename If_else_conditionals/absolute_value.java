package If_else_conditionals;

import java.util.Scanner;

public class absolute_value {
    public static int ab(int num){
        if(num < 0){
            return -num;
        }else{
            return num;
        }
    }
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        num = sc.nextInt();

        int store_value = Math.abs(num);
        System.out.println(store_value);

        System.out.println("__________________________________________________________");

        int newStore = ab(num);
        System.out.println(newStore);




    }
}

package If_else_conditionals;


import java.util.Scanner;

public class validTriangle {
    public static void main(String[] args)
    {
        //Creating a scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Triangle side a : ");
        int a = scan.nextInt();
        System.out.print("Triangle side b : ");
        int b = scan.nextInt();
        System.out.print("Triangle side c : ");
        int c = scan.nextInt();

        if(a+b > c && b+c > a && c+a > b){
            System.out.println("valid triangle.");
        }else{
            System.out.println("not valid.");
        }


    }
}

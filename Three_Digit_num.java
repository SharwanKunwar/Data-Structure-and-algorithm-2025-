import java.util.Scanner;

public class Three_Digit_num {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int num = scan.nextInt();

        if(num > 99 && num < 1000){
            System.out.println("This is three digit number.");
        }else{
            System.out.println("This is not a three digit number.");
        }

    }
}

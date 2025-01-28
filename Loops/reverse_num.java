package Loops;

import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Num: ");
        int num = scan.nextInt();
        int reverse = 0;

        while (num != 0) {
            int ld = num % 10;
            reverse = reverse * 10 + ld;
            num /= 10;
        }

        System.out.println("Reversed number: " + reverse);
        scan.close();
    }
}

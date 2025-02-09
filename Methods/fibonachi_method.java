package Methods;

//Author: Sharwan jung kunwar
//Purpose: To find fobonachi series of a number.

public class fibonachi_method {
    public static void main(String[] args)
    {
                int result = factorial(5);
                System.out.println("Factorial: " + result);

    }
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}

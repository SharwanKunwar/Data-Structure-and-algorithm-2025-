package Methods;

//Author: Sharwan jung kunwar
//Purpose: To calculate the power of a sum using method.

public class cal_power {
    public static void main(String[] args) {
        int result = power(2, 3);
        System.out.println("Result of 2^3: " + result);
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}


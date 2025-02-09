package Methods;

//Author: Sharwan jung kunwar
//Purpose: To check the number is prime or not using method.

public class prime_check {
    public static void main(String[] args) {
        boolean result = isPrime(11);
        System.out.println("Is Prime: " + result);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


// File: PrimeNeonBuzzChecker.java
/*
 * This program checks multiple number properties using separate methods:
 * Prime, Neon, Spy, Automorphic, Buzz
 * Demonstrates clean separation of concerns with focused boolean-returning methods
 */
package CoreProgramming.Methods.Level3;

public class PrimeNeonBuzzChecker {

    // Checks if number is prime (divisible only by 1 and itself)
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Checks if number is Neon (sum of digits of square equals the number)
    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    // Checks if number is Spy (sum of digits equals product of digits)
    public static boolean isSpy(int n) {
        int sum = 0, product = 1, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Checks if number is Automorphic (square ends with the number itself)
    public static boolean isAutomorphic(int n) {
        long square = (long) n * n;
        return String.valueOf(square).endsWith(String.valueOf(n));
    }

    // Checks if number is Buzz (divisible by 7 or ends with 7)
    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Prime: " + isPrime(n));
        System.out.println("Neon: " + isNeon(n));
        System.out.println("Spy: " + isSpy(1124));
        System.out.println("Automorphic: " + isAutomorphic(5));
        System.out.println("Buzz: " + isBuzz(n));
    }
}
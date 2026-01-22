// File: NumberPropertiesMultiChecker.java
/*
 * This program checks multiple number properties:
 * Perfect, Abundant, Deficient, Strong
 * Demonstrates factor summation and factorial calculations.
 */
package CoreProgramming.Methods.Level3;

public class NumberPropertiesMultiChecker {

    // Returns count of all divisors of number (including 1 and itself)
    public static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        return count;
    }

    // Returns array containing all factors of number
    public static int[] getAllFactors(int n) {
        int count = countFactors(n);
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Checks if number is Perfect (sum of proper divisors = number)
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    // Checks if number is Abundant (sum of proper divisors > number)
    public static boolean isAbundant(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum > n;
    }

    // Checks if number is Deficient (sum of proper divisors < number)
    public static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum < n;
    }

    // Calculates factorial of a number
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Checks if number is Strong (sum of factorial of digits = number)
    public static boolean isStrong(int num) {
        int temp = num;
        long sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Perfect: " + isPerfect(n));
        System.out.println("Abundant: " + isAbundant(n));
        System.out.println("Deficient: " + isDeficient(n));
        System.out.println("Strong: " + isStrong(145));
    }
}
/*
 * This program finds all factors of a number, then calculates sum, product
 * and sum of squares of those factors using separate static methods.
 * It shows how to return arrays from methods and perform aggregate operations.
 */
package CoreProgramming.Methods.Level2;

import java.util.Scanner;

public class FactorsCalculator {

    // Method finds and returns array of all factors including number itself
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int pos = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[pos] = i;
                pos++;
            }
        }
        return factors;
    }

    // Method calculates sum of all elements in array
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method calculates product of all elements in array
    public static long calculateProduct(int[] arr) {
        long product = 1;
        for (int num : arr) {
            product *= num;
        }
        return product;
    }

    // Method calculates sum of squares of all elements in array
    public static long calculateSumOfSquares(int[] arr) {
        long sumOfSquares = 0;
        for (int num : arr) {
            sumOfSquares += Math.pow(num, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        // Scanner is used to read number from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = sc.nextInt();

        // Getting all factors
        int[] factors = findFactors(number);

        // Printing sum of factors
        System.out.println("Sum is: " + calculateSum(factors));
        // Printing product of factors
        System.out.println("Product is: " + calculateProduct(factors));
        // Printing sum of squares of factors
        System.out.println("Sum of Square is: " + calculateSumOfSquares(factors));

        sc.close();
    }
}
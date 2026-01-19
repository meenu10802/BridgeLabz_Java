/*
 * This program calculates sum of first N natural numbers using a loop.
 * It shows how to implement summation logic inside a method.
 */
package CoreProgramming.Methods.Level1;

import java.util.Scanner;

public class NaturalNumbersSumCalculator {

    // Method calculates sum of first N natural numbers
    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Scanner is used to read input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = sc.nextInt();

        // Creating object because method is non-static
        NaturalNumbersSumCalculator obj = new NaturalNumbersSumCalculator();

        // Calling method and printing the result
        System.out.println("Sum is " + obj.calculateSum(number));

        sc.close();
    }
}
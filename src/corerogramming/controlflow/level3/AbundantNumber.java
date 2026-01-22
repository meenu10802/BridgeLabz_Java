/*
 * This program checks whether a given number is an Abundant Number or not.
 * A number is abundant if the sum of its proper divisors (excluding itself)
 * is greater than the number itself. This exercise helps understand divisor
 * summation and comparison logic using loops.
 */
package CoreProgramming.ControlFlow.Level3;

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number to check
        int number = sc.nextInt();

        int sum = 0;

        // Calculate sum of all proper divisors (1 to number-1)
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check and display abundant status
        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        sc.close();
    }
}
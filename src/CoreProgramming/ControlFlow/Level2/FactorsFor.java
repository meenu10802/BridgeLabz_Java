/*
 * This program prints all proper factors (divisors excluding the number itself)
 * of a given positive integer using a for loop.
 * It helps understand the concept of divisibility and systematic checking
 * of possible divisors.
 */
package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

public class FactorsFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number
        int number = sc.nextInt();

        if (number > 0) {
            // Check every number from 1 to number-1
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
/*
 * This program implements the well-known FizzBuzz problem using a while loop.
 * It prints numbers from 1 to N, but replaces multiples of 3 with "Fizz",
 * multiples of 5 with "Buzz", and multiples of both with "FizzBuzz".
 * The task demonstrates proper while loop usage and careful ordering
 * of conditional checks to avoid incorrect replacements.
 */
package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the upper limit
        int number = input.nextInt();

        if (number > 0) {
            int i = 1;

            // Generate sequence from 1 to N using while loop
            while (i <= number) {
                // Most specific condition first
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check divisible by 3 only
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check divisible by 5 only
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Default case - print the number
                else {
                    System.out.println(i);
                }
                i++;
            }
        }

        input.close();
    }
}
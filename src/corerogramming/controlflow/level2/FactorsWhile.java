/*
 * This program prints all proper factors (divisors excluding the number itself)
 * of a given positive integer using a while loop.
 * It shows an alternative loop structure for the same divisibility checking task.
 */
package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number
        int number = sc.nextInt();

        if (number > 0) {
            int i = 1;

            // Check for factors using while loop
            while (i < number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }

        sc.close();
    }
}
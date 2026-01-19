/*
 * This class calculates sum of first N natural numbers using both loop and formula
 */
package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

class NaturalSumFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read number
        int number = input.nextInt();

        if (number >= 1) {
            int sumLoop = 0;

            // Calculate sum using for loop
            for (int i = 1; i <= number; i++) {
                sumLoop += i;
            }

            // Calculate sum using formula
            int sumFormula = number * (number + 1) / 2;

            // Print both results
            System.out.println(sumLoop);
            System.out.println(sumFormula);
        }

        input.close();
    }
}
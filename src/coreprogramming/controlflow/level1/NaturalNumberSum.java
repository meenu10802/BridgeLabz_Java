/*
 * This class calculates sum of first N natural numbers using formula
 */
package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read number
        int number = input.nextInt();

        if (number >= 1) {
            // Calculate sum using formula n*(n+1)/2
            int sum = number * (number + 1) / 2;

            // Display result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        input.close();
    }
}
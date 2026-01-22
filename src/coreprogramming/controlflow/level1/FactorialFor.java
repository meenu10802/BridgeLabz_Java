/*
 * This class calculates factorial of a number using for loop
 */
package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read number
        int number = input.nextInt();

        if (number >= 1) {
            long factorial = 1;

            // Calculate factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Print result
            System.out.println(factorial);
        }

        input.close();
    }
}
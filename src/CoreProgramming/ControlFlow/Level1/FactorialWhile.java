/*
 * This class calculates factorial of a number using while loop
 */
package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read number for factorial
        int number = input.nextInt();

        if (number >= 1) {
            long factorial = 1;
            int i = 1;

            // Calculate factorial using while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Display result
            System.out.println(factorial);
        }

        input.close();
    }
}
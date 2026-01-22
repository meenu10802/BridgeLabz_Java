/*
 * This program calculates a number raised to a given power using repeated multiplication
 * inside a while loop. It demonstrates an alternative way to implement exponentiation
 * using loop control and counter variables instead of the more common for loop approach.
 */
package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read base and exponent
        int number = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        // Multiply number 'power' times using while loop
        while (counter < power) {
            result = result * number;
            counter++;
        }

        // Display the final result
        System.out.println(result);

        sc.close();
    }
}
/*
 * This program prints multiplication table only for multipliers 6, 7, 8, 9
 * of a given number. It focuses on selective range printing and demonstrates
 * how to limit loop iterations to a specific subset of values.
 */
package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the base number
        int number = input.nextInt();

        // Print multiplication only for 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        input.close();
    }
}
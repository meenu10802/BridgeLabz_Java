/*
 * This program prints all multiples of a given number between 1 and 100
 * in descending order (from 100 down to 1) using a for loop.
 * It practices reverse iteration and conditional checking with the modulo operator.
 */
package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

public class MultiplesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number whose multiples we want
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            // Check from 100 down to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
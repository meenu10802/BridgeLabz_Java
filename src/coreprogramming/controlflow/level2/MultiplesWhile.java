/*
 * This program prints all multiples of a given number between 1 and 100
 * in descending order (from 100 down to 1) using a while loop.
 * It shows how to implement reverse counting and multiple detection
 * with a different loop structure.
 */
package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            int counter = 100;

            // Check downwards using while loop
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }

        sc.close();
    }
}
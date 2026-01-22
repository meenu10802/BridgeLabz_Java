/*
 * This program finds the greatest proper factor (largest divisor excluding the number itself)
 * of a given positive integer by checking downwards using a while loop.
 * It illustrates how to implement the same largest-factor-finding logic
 * with a different loop construct.
 */
package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number
        int number = sc.nextInt();

        int greatestFactor = 1;
        int counter = number - 1;

        // Check downwards until we find the largest proper factor
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println(greatestFactor);

        sc.close();
    }
}
/*
 * This program finds and prints the greatest proper factor (largest divisor excluding
 * the number itself) of a given positive integer by checking downwards from number-1
 * using a for loop. It demonstrates an efficient approach to finding the largest
 * divisor by stopping at the first match when searching from highest to lowest.
 */
package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

public class GreatestFactorsFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number
        int number = sc.nextInt();

        int greatestFactor = 1;

        // Search from largest possible factor downwards
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // Print the greatest proper factor
        System.out.println(greatestFactor);

        sc.close();
    }
}
/*
 * This program checks if a number is positive or negative and prints the result.
 * It demonstrates basic conditional logic inside main method.
 */
package CoreProgramming.Methods.Level2;

import java.util.Scanner;

public class PositiveOrNegativeChecker {

    public static void main(String[] args) {
        // Scanner is used to read number from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        // Checking and printing if positive or negative
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}
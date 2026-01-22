/*
 * This program checks whether a given three-digit number is an Armstrong Number.
 * An Armstrong number is equal to the sum of the cubes of its own digits.
 * This classic problem helps understand digit manipulation and number theory concepts.
 */
package CoreProgramming.ControlFlow.Level3;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Calculate sum of cubes of each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber /= 10;
        }

        // Check if sum equals original number
        if (sum == number) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}
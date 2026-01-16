/*
 * This program checks whether a given number is a Harshad Number (Niven Number).
 * A Harshad number is divisible by the sum of its own digits.
 * This exercise helps practice digit extraction using modulo and division operations.
 */
package CoreProgramming.ControlFlow.Level3;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number
        int number = sc.nextInt();

        int temp = number;
        int sum = 0;

        // Calculate sum of digits
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Check if number is divisible by sum of its digits
        if (number % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        sc.close();
    }
}
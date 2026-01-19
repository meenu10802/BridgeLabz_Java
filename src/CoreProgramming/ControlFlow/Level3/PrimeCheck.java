/*
 * This program checks whether a given number is a Prime Number or not.
 * A prime number is greater than 1 and has no positive divisors other than 1 and itself.
 * This exercise demonstrates basic primality testing using trial division.
 */
package CoreProgramming.ControlFlow.Level3;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number to check
        int number = sc.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to number-1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

        sc.close();
    }
}
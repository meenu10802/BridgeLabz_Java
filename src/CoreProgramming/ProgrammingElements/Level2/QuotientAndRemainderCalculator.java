/*
 * This class calculates quotient and remainder of two integer numbers
 */
package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

public class QuotientAndRemainderCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two integers from user
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        // Calculate quotient and remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Display the results
        System.out.println("The Quotient is " + quotient +
                " and Remainder is " + remainder +
                " of two numbers " + dividend + " and " + divisor);

        sc.close();
    }
}
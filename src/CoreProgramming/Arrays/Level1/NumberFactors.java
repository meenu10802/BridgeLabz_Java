// File: NumberFactors.java
/**
 * Class Name: NumberFactors
 * Purpose:    Find and display all factors of a given positive number
 * Input:      One positive integer
 * Output:     Space separated list of all factors
 */
package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

public class NumberFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number whose factors we want to find
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid");
            sc.close();
            return;
        }

        // Initial array with small capacity
        int[] factors = new int[10];
        int count = 0;

        // Check every number from 1 to given number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Resize array if needed
                if (count == factors.length) {
                    int[] temp = new int[factors.length * 2];
                    System.arraycopy(factors, 0, temp, 0, count);
                    factors = temp;
                }
                factors[count++] = i;
            }
        }

        // Print all found factors
        for (int i = 0; i < count; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
/*
 * This program calculates custom length of a string without using built-in length()
 * by intentionally generating StringIndexOutOfBoundsException in a loop.
 * It demonstrates exception-based control flow for string processing
 * and compares with standard length() method.
 */
package CoreProgramming.Strings.Level2;

import java.util.Scanner;

public class StringLengthFinder {

    // Method finds length by looping charAt until exception is thrown
    public static int findCustomLength(String text) {
        int count = 0;
        int i = 0;
        try {
            while (true) {
                text.charAt(i);
                count++;
                i++;
            }
        } catch (RuntimeException e) {
            // Exception caught when index out of bounds, returning count as length
            return count;
        }
    }

    public static void main(String[] args) {
        // Scanner is used to read text input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text:");
        String text = sc.next();

        // Calculating custom length
        int customLength = findCustomLength(text);

        // Using built-in length for comparison
        int builtInLength = text.length();

        // Printing custom calculated length
        System.out.println("Custom Length:" + customLength);
        // Printing built-in length
        System.out.println("Built-in Length:" + builtInLength);

        sc.close();
    }
}
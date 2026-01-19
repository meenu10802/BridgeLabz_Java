/*
 * This program demonstrates generating and handling IllegalArgumentException
 * for invalid substring arguments (start > end).
 * It shows proper try-catch for argument validation errors.
 */
package CoreProgramming.Strings.Level1;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method calls substring with invalid args, generating IllegalArgumentException
    public static void generateArgumentException(String text) {
        text.substring(5, 2);
    }

    // Method handles IllegalArgumentException and general RuntimeException
    public static void handleArgumentException(String text) {
        try {
            text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            // Specific handling for invalid method arguments
            System.out.println("IllegalArgumentException Handled");
        } catch (RuntimeException e) {
            // Generic handling for other runtime issues
            System.out.println("RuntimeException Handled");
        }
    }

    public static void main(String[] args) {
        // Scanner is used to read text from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text:");
        String text = sc.next();

        // Calling handling method instead of generating exception
        handleArgumentException(text);
        // Uncomment to generate exception: generateArgumentException(text);

        sc.close();
    }
}
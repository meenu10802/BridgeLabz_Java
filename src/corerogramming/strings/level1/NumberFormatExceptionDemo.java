/*
 * This program demonstrates handling NumberFormatException when parsing string to integer.
 * It shows both generating the exception and handling it with try-catch,
 * including a generic RuntimeException catch for broader error management.
 */
package CoreProgramming.Strings.Level1;

import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method attempts to parse string to int, generating NumberFormatException if invalid
    public static int generateParseException(String str) {
        return Integer.parseInt(str);
    }

    // Method handles NumberFormatException and general RuntimeException when parsing
    public static void handleParseException(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            // Specific handling for invalid number format in string
            System.out.println("No valid number in string");
        } catch (RuntimeException e) {
            // Generic handling for other runtime errors
            System.out.println("RuntimeException Handled");
        }
    }

    public static void main(String[] args) {
        // Scanner is used to read string input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Calling handling method instead of generating exception
        handleParseException(str);
        // Uncomment to generate exception: generateParseException(str);

        sc.close();
    }
}
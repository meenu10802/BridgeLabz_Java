/*
 * This program demonstrates generating and handling StringIndexOutOfBoundsException
 * when accessing invalid string index.
 * It shows the difference between unchecked exception generation and proper try-catch handling.
 */
package CoreProgramming.Strings.Level1;

import java.util.Scanner;

public class StringIndexExceptionDemo {

    // Method attempts to access invalid index, generating StringIndexOutOfBoundsException
    public static void generateIndexException(String text) {
        text.charAt(text.length());
    }

    // Method handles StringIndexOutOfBoundsException when accessing invalid index
    public static void handleIndexException(String text) {
        try {
            text.charAt(text.length());
        } catch (StringIndexOutOfBoundsException e) {
            // Specific handling for out of bounds string access
            System.out.println("StringIndexOutOfBoundsException Handled");
        }
    }

    public static void main(String[] args) {
        // Scanner is used to read text input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text:");
        String text = sc.next();

        // Calling handling method instead of generating exception
        handleIndexException(text);
        // Uncomment to generate exception: generateIndexException(text);

        sc.close();
    }
}
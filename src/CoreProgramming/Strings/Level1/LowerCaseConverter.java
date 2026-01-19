/*
 * This program converts string to lowercase using custom ASCII manipulation and built-in toLowerCase().
 * It compares results for verification, demonstrating character case conversion.
 */
package CoreProgramming.Strings.Level1;

import java.util.Scanner;

public class LowerCaseConverter {

    // Method converts each character to lowercase by adding 32 to ASCII if uppercase
    public static String convertToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result += ch;
        }
        return result;
    }

    // Method compares two strings by length and each character
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Scanner is used to read input text from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text:");
        String text = sc.nextLine();

        // Using custom conversion method
        String custom = convertToLowerCase(text);

        // Using built-in toLowerCase method
        String builtIn = text.toLowerCase();

        // Checking if results match
        boolean result = compareStrings(custom, builtIn);

        // Printing custom result
        System.out.println("Custom:" + custom);
        // Printing built-in result
        System.out.println("Built-in:" + builtIn);
        // Printing match status
        System.out.println("Match:" + result);

        sc.close();
    }
}
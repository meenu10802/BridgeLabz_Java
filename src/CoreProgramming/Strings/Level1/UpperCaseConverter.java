/*
 * This program converts string to uppercase using both custom ASCII manipulation and built-in toUpperCase().
 * It compares the results to verify correctness, demonstrating character conversion logic.
 */
package CoreProgramming.Strings.Level1;

import java.util.Scanner;

public class UpperCaseConverter {

    // Method converts each character to uppercase by subtracting 32 from ASCII if lowercase
    public static String convertToUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result += ch;
        }
        return result;
    }

    // Method compares two strings by length and character-by-character
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
        String custom = convertToUpperCase(text);

        // Using built-in toUpperCase method
        String builtIn = text.toUpperCase();

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
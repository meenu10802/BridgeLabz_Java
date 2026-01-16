/*
 * This program extracts substring using both built-in substring() and custom charAt() loop.
 * It also compares the two substrings for equality, demonstrating string manipulation techniques.
 */
package CoreProgramming.Strings.Level1;

import java.util.Scanner;

public class SubstringExtractor {

    // Method extracts substring using loop and charAt for each character
    public static String extractUsingCharAt(String str, int startIndex, int endIndex) {
        String result = "";
        for (int i = startIndex; i < endIndex; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method compares two strings for equality, checking length and each character
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
        // Scanner is used to read string and indices from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        System.out.println("Enter start index:");
        int startIndex = sc.nextInt();

        System.out.println("Enter end index:");
        int endIndex = sc.nextInt();

        // Using built-in substring method
        String usingSubstring = str.substring(startIndex, endIndex);

        // Using custom charAt method
        String usingCharAt = extractUsingCharAt(str, startIndex, endIndex);

        // Printing original string
        System.out.println("Original String: " + str);
        // Printing substring from charAt method
        System.out.println("Substring from using charAt(): " + usingCharAt);
        // Printing substring from built-in method
        System.out.println("Substring using substring(): " + usingSubstring);
        // Printing comparison result
        System.out.println("Comparison: " + compareStrings(usingCharAt, usingSubstring));

        sc.close();
    }
}
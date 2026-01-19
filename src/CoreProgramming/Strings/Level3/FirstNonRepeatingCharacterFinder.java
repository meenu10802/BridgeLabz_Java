package CoreProgramming.Strings.Level3;

import java.util.Scanner;

/*
 * This program finds the first non-repeating (unique) character in a string
 * using frequency array based on ASCII values (256 characters).
 * It demonstrates character frequency counting and first occurrence detection.
 */
public class FirstNonRepeatingCharacterFinder {

    // Method finds first character that appears only once
    public static char findFirstNonRepeating(String str) {
        int[] frequency = new int[256]; // ASCII character set

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            if (frequency[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '\0'; // No non-repeating character found
    }

    public static void main(String[] args) {
        // Scanner is used to read string from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Finding first non-repeating character
        char result = findFirstNonRepeating(text);

        // Displaying result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }

        sc.close();
    }
}
package CoreProgramming.Strings.Level3;

import java.util.Scanner;

/*
 * This program finds frequency of each character using nested loops
 * and marks duplicates as '0' to avoid re-counting.
 * Demonstrates in-place frequency counting without extra array.
 */
public class CharacterFrequencyNestedLoop {

    // Method calculates frequency using nested loops and returns result array
    public static String[] calculateCharacterFrequency(String str) {
        char[] chars = str.toCharArray();
        int[] frequency = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            frequency[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '0'; // Mark as counted
                }
            }
        }

        // Count non-zero frequency items
        int count = 0;
        for (int f : frequency) {
            if (f > 0) count++;
        }

        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (frequency[i] > 0) {
                result[index++] = chars[i] + " -> " + frequency[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Scanner is used to read string from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Calculating frequency
        String[] frequencyResult = calculateCharacterFrequency(text);

        // Displaying result
        System.out.println("Character Frequency:");
        for (String entry : frequencyResult) {
            System.out.println(entry);
        }

        sc.close();
    }
}
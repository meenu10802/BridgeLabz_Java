package CoreProgramming.Strings.Level3;

import java.util.Scanner;

/*
 * This program checks if two strings are anagrams by comparing character frequencies.
 * It demonstrates frequency array approach for anagram detection.
 */
public class AnagramChecker {

    // Method checks if two strings are anagrams using frequency count
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] frequency = new int[256];

        // Count frequency of characters in first string
        for (int i = 0; i < s1.length(); i++) {
            frequency[s1.charAt(i)]++;
        }

        // Decrease frequency for second string
        for (int i = 0; i < s2.length(); i++) {
            frequency[s2.charAt(i)]--;
        }

        // Check if all frequencies are zero
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Scanner is used to read two strings from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        // Checking anagram status
        boolean result = areAnagrams(str1, str2);

        // Displaying result
        if (result) {
            System.out.println("Both strings are Anagrams");
        } else {
            System.out.println("Strings are NOT Anagrams");
        }

        sc.close();
    }
}
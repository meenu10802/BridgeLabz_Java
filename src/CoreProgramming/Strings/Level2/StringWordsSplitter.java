/*
 * This program splits a string into words without using split() method
 * by manually finding spaces, extracts substrings, and compares with built-in split().
 * It demonstrates custom string tokenization and array comparison.
 */
package CoreProgramming.Strings.Level2;

import java.util.Scanner;

public class StringWordsSplitter {

    // Method finds custom length using exception loop (as per program requirement)
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
            return count;
        }
    }

    // Method splits string into words array by manually finding spaces
    public static String[] splitIntoWords(String str) {
        int len = findCustomLength(str);
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') wordCount++;
        }
        String[] words = new String[wordCount];
        int start = 0, index = 0;
        for (int i = 0; i <= len; i++) {
            if (i == len || str.charAt(i) == ' ') {
                words[index++] = str.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    // Method compares two string arrays for equality (length and content)
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Scanner is used to read full line text from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text:");
        String text = sc.nextLine();

        // Getting custom split words
        String[] customSplit = splitIntoWords(text);

        // Using built-in split for comparison
        String[] builtInSplit = text.split(" ");

        // Printing comparison result
        System.out.println("Comparison matches? " + compareArrays(customSplit, builtInSplit));

        sc.close();
    }
}
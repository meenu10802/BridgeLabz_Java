package CoreProgramming.Strings.Level2;

import java.util.Scanner;

/*
 * This program splits given text into words without using built-in split(),
 * then finds and displays the shortest and longest words in the text.
 * It demonstrates manual string tokenization using charAt() and space detection.
 */
public class WordLengthAnalyzer {

    // Method splits text into words array by detecting spaces manually
    public static String[] splitTextIntoWords(String text) {
        // Count number of words (assuming words separated by single spaces)
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;
        int index = 0;

        // Extract each word using substring
        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                // Extract word from start index to current position
                words[index++] = text.substring(start, i);
                // Move start to next word (skip space)
                start = i + 1;
            }
        }
        return words;
    }

    // Method finds indices of shortest and longest word in the array
    public static int[] findShortestAndLongestIndices(String[] words) {
        if (words == null || words.length == 0) {
            return new int[]{-1, -1}; // Invalid case
        }

        int shortestIndex = 0;
        int longestIndex = 0;

        // Compare lengths of all words
        for (int i = 1; i < words.length; i++) {
            // Update shortest word index
            if (words[i].length() < words[shortestIndex].length()) {
                shortestIndex = i;
            }
            // Update longest word index
            if (words[i].length() > words[longestIndex].length()) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        // Scanner is used to read full line of text from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text (words separated by spaces):");
        String text = sc.nextLine().trim(); // trim to remove leading/trailing spaces

        // Split text into words array
        String[] words = splitTextIntoWords(text);

        // Find indices of shortest and longest words
        int[] indices = findShortestAndLongestIndices(words);

        // Display results
        if (indices[0] != -1) {
            System.out.println("\nResults:");
            System.out.println("Shortest word: '" + words[indices[0]] +
                    "' (length: " + words[indices[0]].length() + ")");
            System.out.println("Longest word: '" + words[indices[1]] +
                    "' (length: " + words[indices[1]].length() + ")");
        } else {
            System.out.println("No words found in the input.");
        }

        // Close scanner to prevent resource leak
        sc.close();
    }
}
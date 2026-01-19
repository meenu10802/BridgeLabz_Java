package CoreProgramming.Strings.Level2;

import java.util.Scanner;

/*
 * This program takes text input, splits it into words without using built-in split(),
 * then finds and displays the shortest and longest words in the text.
 * It demonstrates manual word tokenization using charAt() and space detection.
 */
public class ShortestLongestWordFinder {

    // Method splits text into words array by detecting spaces manually
    public static String[] splitTextIntoWords(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    // Method finds indices of shortest and longest word in array
    public static int[] findShortestAndLongestIndices(String[] words) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < words[shortestIndex].length()) {
                shortestIndex = i;
            }
            if (words[i].length() > words[longestIndex].length()) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        // Scanner is used to read full line of text from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine().trim(); // trim to avoid leading/trailing spaces issues

        // Splitting text into words
        String[] words = splitTextIntoWords(text);

        // Finding indices of shortest and longest words
        int[] indices = findShortestAndLongestIndices(words);

        // Displaying results
        System.out.println("Shortest word: " + words[indices[0]] +
                " (length: " + words[indices[0]].length() + ")");
        System.out.println("Longest word: " + words[indices[1]] +
                " (length: " + words[indices[1]].length() + ")");

        sc.close();
    }
}
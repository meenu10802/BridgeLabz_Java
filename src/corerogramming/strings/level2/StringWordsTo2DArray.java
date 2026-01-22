/*
 * This program splits string into words without split(), creates 2D array with words and their lengths.
 * It demonstrates custom splitting, length calculation and 2D array population for word analysis.
 */
package CoreProgramming.Strings.Level2;

import java.util.Scanner;

public class StringWordsTo2DArray {

    // Method finds custom length using exception loop
    public static int findCustomLength(String str) {
        int i = 0;
        int count = 0;
        try {
            while (true) {
                str.charAt(i);
                i++;
                count++;
            }
        } catch (RuntimeException e) {
            return count;
        }
    }

    // Method splits string into words array manually
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

    // Method creates 2D array with words and their lengths
    public static String[][] createWordsLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findCustomLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        // Scanner is used to read full text line from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text:");
        String text = sc.nextLine();

        // Getting split words
        String[] splitWordsArray = splitIntoWords(text);

        // Creating 2D array with words and lengths
        String[][] twoDResult = createWordsLengthArray(splitWordsArray);

        // Printing header
        System.out.println("\nWords\tLength");
        // Printing each word and its length
        for (int i = 0; i < twoDResult.length; i++) {
            String word = twoDResult[i][0];
            int length = Integer.parseInt(twoDResult[i][1]);
            System.out.println(word + "\t" + length);
        }

        sc.close();
    }
}
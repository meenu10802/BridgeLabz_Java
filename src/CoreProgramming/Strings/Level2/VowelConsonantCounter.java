package CoreProgramming.Strings.Level2;

import java.util.Scanner;

/*
 * This program counts the number of vowels and consonants in a given string.
 * It ignores non-letter characters and is case-insensitive.
 * Demonstrates character classification and counting logic.
 */
public class VowelConsonantCounter {

    // Method checks if character is vowel, consonant, or neither
    public static String classifyCharacter(char ch) {
        // Convert to lowercase using ASCII
        if ('A' <= ch && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        if ('a' <= ch && ch <= 'z') {
            return "Consonant";
        }
        return "Not a Letter";
    }

    // Method counts vowels and consonants in the string
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = classifyCharacter(ch);

            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        // Scanner is used to read full text line from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Getting vowel and consonant counts
        int[] counts = countVowelsAndConsonants(text);

        // Displaying results
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);

        sc.close();
    }
}
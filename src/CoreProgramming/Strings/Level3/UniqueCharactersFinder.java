package CoreProgramming.Strings.Level3;

import java.util.Scanner;

/*
 * This program finds all unique characters in a string without using length()
 * by using exception-based length detection and nested loop uniqueness check.
 * It demonstrates manual length calculation and duplicate detection.
 */
public class UniqueCharactersFinder {

    // Method finds length of string using charAt() until exception
    public static int findCustomLength(String str) {
        int count = 0;
        int i = 0;
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

    // Method finds unique characters using nested loop comparison
    public static char[] findUniqueCharacters(String str) {
        int len = findCustomLength(str);
        char[] unique = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (current == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[uniqueCount++] = current;
            }
        }

        // Create final array with exact size
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    public static void main(String[] args) {
        // Scanner is used to read string from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Finding unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Displaying result
        System.out.print("Unique characters: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
        System.out.println();

        sc.close();
    }
}
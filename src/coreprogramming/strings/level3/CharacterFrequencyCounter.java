package CoreProgramming.Strings.Level3;

import java.util.Scanner;

/*
 * This program counts frequency of each character in a string using ASCII array (256 size)
 * and displays characters with their counts in a clean format.
 * Demonstrates frequency counting using array indexing.
 */
public class CharacterFrequencyCounter {

    // Method calculates frequency of each character
    public static int[] calculateFrequency(String str) {
        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        return frequency;
    }

    // Method displays characters and their frequencies
    public static void displayFrequency(int[] frequency) {
        System.out.println("Character\tFrequency");
        System.out.println("---------\t---------");

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                System.out.println((char)i + "\t\t" + frequency[i]);
            }
        }
    }

    public static void main(String[] args) {
        // Scanner is used to read string from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Calculating frequency
        int[] freq = calculateFrequency(text);

        // Displaying result
        displayFrequency(freq);

        sc.close();
    }
}
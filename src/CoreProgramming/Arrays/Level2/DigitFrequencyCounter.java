/**
 * Class Name: DigitFrequencyCounter
 * Purpose:    Count frequency of each digit (0-9) in a given number
 * Input:      One positive integer
 * Output:     Frequency of each digit from 0 to 9 (even if count is 0)
 */
package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

public class DigitFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input number
        int number = sc.nextInt();

        // Temporary variable to count digits
        int temp = number;
        int digitCount = 0;

        // Count total number of digits
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }

        // Array to store individual digits
        int[] digits = new int[digitCount];

        // Extract digits into array (from right to left)
        for (int i = 0; i < digitCount; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Count frequency of each digit 0-9
        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Display frequency of each digit
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(i + " " + frequency[i]);
        }

        sc.close();
    }
}
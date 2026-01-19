/**
 * Class Name: NumberReverserArray
 * Purpose:    Reverse the digits of a given number using array
 * Input:      One integer number
 * Output:     Reversed digits printed without spaces
 */
package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

public class NumberReverserArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input number
        int number = sc.nextInt();

        int temp = number;
        int digitCount = 0;

        // Count number of digits
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }

        // Array to store digits
        int[] digits = new int[digitCount];

        // Extract digits into array
        for (int i = 0; i < digitCount; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Print digits in reverse order (which is now left to right)
        for (int digit : digits) {
            System.out.print(digit);
        }

        sc.close();
    }
}
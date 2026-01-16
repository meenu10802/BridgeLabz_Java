/**
 * Class Name: LargestTwoDigitsFinderDynamic
 * Purpose:    Find the largest and second largest digit in a number
 *             (using dynamic array that grows as needed)
 * Input:      One integer number
 * Output:     Largest digit on first line, second largest on second line
 */
package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

public class LargestTwoDigitsFinderDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input number
        int number = sc.nextInt();

        int capacity = 10;
        int[] digits = new int[capacity];
        int index = 0;

        // Extract all digits with dynamic resizing
        while (number != 0) {
            if (index == capacity) {
                capacity += 10;
                int[] temp = new int[capacity];
                for (int i = 0; i < index; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println(largest);
        System.out.println(secondLargest);

        sc.close();
    }
}
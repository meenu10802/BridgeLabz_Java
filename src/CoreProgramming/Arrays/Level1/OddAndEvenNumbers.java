// File: OddAndEvenNumbers.java
/**
 * Class Name: OddAndEvenNumbers
 * Purpose:    Separate numbers 1 to N into two arrays - odd and even
 * Input:      Positive integer N
 * Output:     First line: all odd numbers
 *             Second line: all even numbers
 */
package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

public class OddAndEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read upper limit number
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid");
            sc.close();
            return;
        }

        int[] odds = new int[(n + 1) / 2];
        int[] evens = new int[n / 2];
        int oddCount = 0, evenCount = 0;

        // Classify each number as odd or even
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evens[evenCount++] = i;
            } else {
                odds[oddCount++] = i;
            }
        }

        // Print all odd numbers
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odds[i] + " ");
        }
        System.out.println();

        // Print all even numbers
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evens[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
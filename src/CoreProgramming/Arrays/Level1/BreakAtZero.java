/**
 * Class Name: BreakAtZero
 * Purpose:    Keep reading positive numbers until <=0 or array is full (max 10)
 *             Calculate and print sum of all valid positive numbers
 * Input:      Sequence of double numbers (stops on <=0 or after 10)
 * Output:     Sum of all positive numbers read
 */
package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

public class BreakAtZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store up to 10 positive numbers
        double[] numbers = new double[10];
        int count = 0;

        // Keep reading numbers until non-positive or limit reached
        while (true) {
            double num = sc.nextDouble();
            if (num <= 0 || count >= 10) {
                break;
            }
            numbers[count++] = num;
        }

        // Calculate sum of all valid numbers
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += numbers[i];
        }

        // Display final sum
        System.out.println(sum);

        sc.close();
    }
}
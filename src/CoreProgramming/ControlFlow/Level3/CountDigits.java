/*
 * This program calculates the total number of digits in a given integer.
 * It demonstrates the classic digit-counting technique using repeated division by 10.
 */
package CoreProgramming.ControlFlow.Level3;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number
        int number = sc.nextInt();

        int count = 0;
        int temp = number;

        // Count digits by removing last digit repeatedly
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Display the count
        System.out.println(count);

        sc.close();
    }
}
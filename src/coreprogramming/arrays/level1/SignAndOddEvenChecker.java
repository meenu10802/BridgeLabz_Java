/**
 * Class Name: SignAndOddEvenChecker
 * Purpose:    Read 5 integers and classify each number as 
 *             Positive Even, Positive Odd, Negative or Zero.
 *             Also compare first and last number.
 * Input:      5 integers from user
 * Output:     Classification message for each number + 
 *             comparison result (Equal/Greater/Less)
 */
package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

public class SignAndOddEvenChecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create array to store 5 numbers
        int[] numbers = new int[5];

        // Read 5 numbers from user and classify each immediately
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();

            // Check sign and parity of current number
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println("Positive Even");
                } else {
                    System.out.println("Positive Odd");
                }
            } else if (numbers[i] < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }

        // Compare first and last element of the array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("Equal");
        } else if (first > last) {
            System.out.println("Greater");
        } else {
            System.out.println("Less");
        }

        sc.close();
    }
}
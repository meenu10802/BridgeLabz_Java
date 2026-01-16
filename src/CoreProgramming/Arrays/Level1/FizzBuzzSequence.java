// File: FizzBuzzSequence.java
/**
 * Class Name: FizzBuzzSequence
 * Purpose:    Generate FizzBuzz sequence from 1 to N and store in array
 * Input:      Positive integer N
 * Output:     Position-wise description of each value
 */
package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

public class FizzBuzzSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the upper limit for fizzbuzz sequence
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid");
            sc.close();
            return;
        }

        String[] sequence = new String[n];

        // Generate sequence following fizzbuzz rules
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sequence[i-1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                sequence[i-1] = "Fizz";
            } else if (i % 5 == 0) {
                sequence[i-1] = "Buzz";
            } else {
                sequence[i-1] = String.valueOf(i);
            }
        }

        // Print each position and its value
        for (int i = 0; i < sequence.length; i++) {
            System.out.println("Position " + (i+1) + " = " + sequence[i]);
        }

        sc.close();
    }
}
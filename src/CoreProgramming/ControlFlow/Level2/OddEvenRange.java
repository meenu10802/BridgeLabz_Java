/*
 * This program prints whether each number from 1 to N is odd or even.
 * It helps understand basic modulo operation and conditional branching
 * inside a loop for classification tasks.
 */
package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

class OddEvenRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read upper limit
        int number = input.nextInt();

        if (number >= 1) {
            // Check each number from 1 to N
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }

        input.close();
    }
}
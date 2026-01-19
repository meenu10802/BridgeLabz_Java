/*
 * This program generates the classic FizzBuzz sequence from 1 to a given number N
 * using a for loop. It replaces multiples of 3 with "Fizz", multiples of 5 with "Buzz",
 * and multiples of both 3 and 5 with "FizzBuzz", while printing other numbers as they are.
 * The exercise helps practice loop control, conditional logic, and the importance
 * of checking combined conditions before individual ones.
 */
package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

class FizzBuzzFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read upper limit
        int number = input.nextInt();

        if (number > 0) {
            // Generate FizzBuzz sequence
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }

        input.close();
    }
}
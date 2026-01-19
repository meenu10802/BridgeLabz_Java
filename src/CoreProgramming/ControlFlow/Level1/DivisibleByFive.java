/*
 * This class checks whether a number is divisible by 5 or not
 */
package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

class DivisibleByFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the number to check
        int number = input.nextInt();

        String result;

        // Check divisibility by 5
        if (number % 5 == 0) {
            result = "Yes";
        } else {
            result = "No";
        }

        // Display the result
        System.out.println("Is the number " + number + " divisible by 5? " + result);

        input.close();
    }
}
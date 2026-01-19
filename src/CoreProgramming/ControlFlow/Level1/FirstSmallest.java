/*
 * This class checks if the first number is the smallest among three numbers
 */
package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

class FirstSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read three numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        String result;

        // Check if first number is smallest
        if (number1 < number2 && number1 < number3) {
            result = "Yes";
        } else {
            result = "No";
        }

        // Display the result
        System.out.println("Is the first number the smallest? " + result);

        input.close();
    }
}
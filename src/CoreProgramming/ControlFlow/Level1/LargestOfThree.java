/*
 * This class checks which of the three numbers is the largest
 */
package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read three numbers from user
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        String first, second, third;

        // Check if first number is largest
        if (number1 > number2 && number1 > number3) {
            first = "Yes";
        } else {
            first = "No";
        }

        // Check if second number is largest
        if (number2 > number1 && number2 > number3) {
            second = "Yes";
        } else {
            second = "No";
        }

        // Check if third number is largest
        if (number3 > number1 && number3 > number2) {
            third = "Yes";
        } else {
            third = "No";
        }

        // Display results for each position
        System.out.println("Is the first number the largest? " + first);
        System.out.println("Is the second number the largest? " + second);
        System.out.println("Is the third number the largest? " + third);

        input.close();
    }
}
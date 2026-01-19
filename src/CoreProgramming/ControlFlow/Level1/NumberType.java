/*
 * This class determines if a number is positive, negative or zero
 */
package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

class NumberType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read number
        int number = input.nextInt();

        // Check and print number type
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        input.close();
    }
}
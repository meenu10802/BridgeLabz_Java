/*
 * This class performs basic arithmetic operations on two decimal numbers
 */
package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

public class BasicArithmeticCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two decimal numbers from user
        double firstNumber = sc.nextDouble();
        double secondNumber = sc.nextDouble();

        // Perform addition, subtraction, multiplication and division
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;

        // Display all results
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " +
                firstNumber + " and " + secondNumber + " is " +
                sum + ", " + difference + ", " + product + ", and " + division);

        sc.close();
    }
}
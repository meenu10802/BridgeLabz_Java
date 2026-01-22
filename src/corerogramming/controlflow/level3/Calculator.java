/*
 * This program implements a basic calculator that performs addition, subtraction,
 * multiplication, or division based on the user-entered operator.
 * It demonstrates the use of switch-case for handling multiple operation choices cleanly.
 */
package CoreProgramming.ControlFlow.Level3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two numbers and operator
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        String op = sc.next();

        // Perform operation based on operator
        switch (op) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                System.out.println(first / second);
                break;
            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}
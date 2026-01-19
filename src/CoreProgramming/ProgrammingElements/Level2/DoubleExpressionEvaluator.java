/*
 * This class evaluates different arithmetic expressions using three decimal numbers
 */
package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

public class DoubleExpressionEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read three decimal values
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Evaluate different expressions
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Display all results
        System.out.println("The results of Double Operations are " +
                result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        sc.close();
    }
}
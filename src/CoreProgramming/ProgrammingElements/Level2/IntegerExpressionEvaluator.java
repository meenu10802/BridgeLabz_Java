/*
 * This class evaluates different arithmetic expressions using three integers
 */
package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

public class IntegerExpressionEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read three integer values
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Evaluate different expressions
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Display all results
        System.out.println("The results of Int Operations are " +
                result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        sc.close();
    }
}
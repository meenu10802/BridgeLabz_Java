/*
 * This program calculates sine, cosine and tangent of a given angle in degrees.
 * Demonstrates method returning multiple values (array) and angle conversion.
 */
package CoreProgramming.Methods.Level1;

import java.util.Scanner;

public class TrigonometricFunctionsCalculator {

    // Method calculates sine, cosine and tangent of angle in degrees
    public double[] calculateTrigFunctions(double angleDegrees) {
        double radians = Math.toRadians(angleDegrees);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        // Scanner is used to read angle value from user
        Scanner sc = new Scanner(System.in);

        double angle = sc.nextDouble();

        TrigonometricFunctionsCalculator calc = new TrigonometricFunctionsCalculator();

        // Getting trigonometric values
        double[] results = calc.calculateTrigFunctions(angle);

        // Printing sine value
        System.out.println(results[0]);
        // Printing cosine value
        System.out.println(results[1]);
        // Printing tangent value
        System.out.println(results[2]);

        sc.close();
    }
}
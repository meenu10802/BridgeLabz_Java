/*
 * This class calculates area of a triangle in square cm and square inches
 */
package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read base and height in centimeters
        double baseCm = sc.nextDouble();
        double heightCm = sc.nextDouble();

        // Calculate area in square centimeters
        double areaSqCm = 0.5 * baseCm * heightCm;

        // Convert area to square inches
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Display both areas
        System.out.println("The Area of the triangle in sq in is " + areaSqIn +
                " and sq cm is " + areaSqCm);

        sc.close();
    }
}
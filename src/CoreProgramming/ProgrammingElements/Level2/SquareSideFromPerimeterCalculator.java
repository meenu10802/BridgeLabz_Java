/*
 * This class calculates length of one side of square from its perimeter
 */
package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

public class SquareSideFromPerimeterCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read perimeter of the square
        double perimeter = sc.nextDouble();

        // Calculate length of one side
        double sideLength = perimeter / 4;

        // Display result
        System.out.println("The length of the side is " + sideLength +
                " whose perimeter is " + perimeter);

        sc.close();
    }
}
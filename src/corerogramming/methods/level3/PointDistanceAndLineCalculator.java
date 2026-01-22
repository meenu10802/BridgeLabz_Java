// File: PointDistanceAndLineCalculator.java
/*
 * This program calculates distance between two points and
 * slope + y-intercept of line connecting them.
 * Demonstrates basic coordinate geometry calculations.
 */
package CoreProgramming.Methods.Level3;

public class PointDistanceAndLineCalculator {

    // Calculates Euclidean distance between two points (x1,y1) and (x2,y2)
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Calculates slope (m) and y-intercept (b) of line between two points
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        double x1 = 2, y1 = 3, x2 = 4, y2 = 7;

        System.out.println("Distance: " + calculateDistance(x1, y1, x2, y2));

        double[] line = calculateLineEquation(x1, y1, x2, y2);
        System.out.println("m: " + line[0] + " b: " + line[1]);
    }
}
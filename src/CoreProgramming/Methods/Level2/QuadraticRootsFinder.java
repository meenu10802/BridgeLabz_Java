/*
 * This program finds roots of quadratic equation ax^2 + bx + c = 0.
 * It handles two real roots, one root or no real roots based on discriminant.
 * Demonstrates returning variable-length array based on conditions.
 */
package CoreProgramming.Methods.Level2;

import java.util.Scanner;

public class QuadraticRootsFinder {

    // Method calculates discriminant and returns roots array (2, 1 or 0 elements)
    public static double[] findRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{root1, root2};
        }
        if (discriminant == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }
        return new double[0];
    }

    public static void main(String[] args) {
        // Scanner is used to read coefficients a, b, c
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Getting roots
        double[] roots = findRoots(a, b, c);

        // Printing all found roots (if any)
        for (double root : roots) {
            System.out.println(root);
        }

        sc.close();
    }
}
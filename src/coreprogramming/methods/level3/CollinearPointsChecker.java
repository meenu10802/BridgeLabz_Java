/*
 * This program checks if three points are collinear using slope or area method.
 * Demonstrates two ways to test collinearity in coordinate geometry.
 */
package CoreProgramming.Methods.Level3;

public class CollinearPointsChecker {

    // Checks collinearity by comparing slopes between points
    public static boolean checkBySlopeMethod(double x1, double y1, double x2, double y2, double x3, double y3) {
        double s1 = (y2 - y1) / (x2 - x1);
        double s2 = (y3 - y2) / (x3 - x2);
        double s3 = (y3 - y1) / (x3 - x1);
        return s1 == s2 && s2 == s3;
    }

    // Checks collinearity by calculating triangle area (zero if collinear)
    public static boolean checkByAreaMethod(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        System.out.println(checkBySlopeMethod(2,4,4,6,6,8));
        System.out.println(checkByAreaMethod(2,4,4,6,6,8));
    }
}
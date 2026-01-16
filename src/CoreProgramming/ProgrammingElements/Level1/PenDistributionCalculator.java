/*
 * This class shows how pens are distributed among kids and how many remain
 */
package CoreProgramming.ProgrammingElements.Level1;

public class PenDistributionCalculator {
    public static void main(String[] args) {
        int totalPens = 14;
        int numberOfKids = 3;

        // Calculate distribution and remaining pens
        int pensPerKid = totalPens / numberOfKids;
        int pensLeft = totalPens % numberOfKids;

        // Show the result
        System.out.println("The Pen Per Student is " + pensPerKid +
                " and the remaining pen not distributed is " + pensLeft);
    }
}
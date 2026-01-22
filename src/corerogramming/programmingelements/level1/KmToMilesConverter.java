/*
 * This class converts distance from kilometers to miles
 */
package CoreProgramming.ProgrammingElements.Level1;

public class KmToMilesConverter {
    public static void main(String[] args) {
        double distanceInKm = 10.8;

        // Convert km to miles
        double distanceInMiles = distanceInKm / 1.6;

        // Show the converted value
        System.out.println("The distance " + distanceInKm +
                " km in miles is " + distanceInMiles);
    }
}
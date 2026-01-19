/*
 * This class calculates the volume of Earth in cubic kilometers and cubic miles
 */
package CoreProgramming.ProgrammingElements.Level1;

public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double radiusInKm = 6378;

        // Calculate volume in cubic kilometers
        double volumeInKm = (4.0 / 3) * Math.PI * Math.pow(radiusInKm, 3);

        // Convert volume from km³ to miles³
        double volumeInMiles = volumeInKm / Math.pow(1.6, 3);

        // Display both volumes
        System.out.println("The volume of earth in cubic kilometers is " + volumeInKm +
                " and cubic miles is " + volumeInMiles);
    }
}
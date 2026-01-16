/*
 * This program provides multiple unit conversion methods
 * for distance, weight, volume between metric and imperial systems.
 * It demonstrates static methods for reusable conversion logic.
 */
package CoreProgramming.Methods.Level2;

public class UnitConverter {

    // Method converts kilometers to miles using fixed ratio
    public static double convertKmToMiles(double km) {
        double kmToMiles = 0.621371;
        return km * kmToMiles;
    }

    // Method converts miles to kilometers using fixed ratio
    public static double convertMilesToKm(double miles) {
        double milesToKm = 1.60934;
        return miles * milesToKm;
    }

    // Method converts meters to feet using fixed ratio
    public static double convertMetersToFeet(double meters) {
        double metersToFeet = 3.28084;
        return meters * metersToFeet;
    }

    // Method converts feet to meters using fixed ratio
    public static double convertFeetToMeters(double feet) {
        double feetToMeters = 0.3048;
        return feet * feetToMeters;
    }

    // Method converts centimeters to inches using fixed ratio
    public static double convertCmToInches(double cm) {
        double cmToInches = 0.393701;
        return cm * cmToInches;
    }

    // Method converts inches to centimeters using fixed ratio
    public static double convertInchesToCm(double inches) {
        double inchesToCm = 2.54;
        return inches * inchesToCm;
    }

    // Method converts pounds to kilograms using fixed ratio
    public static double convertPoundsToKilograms(double pounds) {
        double poundsToKg = 0.453592;
        return pounds * poundsToKg;
    }

    // Method converts kilograms to pounds using fixed ratio
    public static double convertKilogramsToPounds(double kg) {
        double kgToPounds = 2.20462;
        return kg * kgToPounds;
    }

    // Method converts gallons to liters using fixed ratio
    public static double convertGallonsToLiters(double gallons) {
        double gallonsToLiters = 3.78541;
        return gallons * gallonsToLiters;
    }

    // Method converts liters to gallons using fixed ratio
    public static double convertLitersToGallons(double liters) {
        double litersToGallons = 0.264172;
        return liters * litersToGallons;
    }

    // No main method as this is a utility class
}
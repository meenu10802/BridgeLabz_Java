package collectionsandstreams.regex;

import java.util.regex.*;

/**
 * This class validates license plate numbers.
 * Valid format: Starts with two uppercase letters, followed by four digits.
 * 
 * Example valid: "AB1234"
 * Example invalid: "A12345" (only one letter)
 */
public class LicensePlateValidation {
    
    // Main method to test license plate validation
    public static void main(String[] args) {
        // Define the regex pattern: 2 uppercase letters followed by 4 digits
        String regex = "^[A-Z]{2}\\d{4}$";
        
        // Test cases
        String[] testPlates = {"AB1234", "A12345", "XY9876", "abc1234", "AB123"};
        
        // Validate each license plate
        for (String plate : testPlates) {
            boolean isValid = validateLicensePlate(plate, regex);
            System.out.println("License Plate: \"" + plate + "\" -> " + (isValid ? "Valid" : "Invalid"));
        }
    }
    
    // Method to validate a license plate using regex
    public static boolean validateLicensePlate(String plate, String regex) {
        // Check if the plate matches the pattern
        return plate.matches(regex);
    }
}

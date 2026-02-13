package collectionsandstreams.regex;

import java.util.regex.*;

/**
 * This class validates hex color codes.
 * Valid format: Starts with # followed by exactly 6 hexadecimal characters (0-9, A-F, a-f).
 * 
 * Example valid: "#FFA500", "#ff4500"
 * Example invalid: "#123" (too short)
 */
public class HexColorValidation {
    
    // Main method to test hex color validation
    public static void main(String[] args) {
        // Define the regex pattern: # followed by 6 hex characters
        String regex = "^#[0-9A-Fa-f]{6}$";
        
        // Test cases
        String[] testColors = {"#FFA500", "#ff4500", "#123", "#ABCDEF", "#12345", "#1234567"};
        
        // Validate each hex color
        for (String color : testColors) {
            boolean isValid = validateHexColor(color, regex);
            System.out.println("Hex Color: \"" + color + "\" -> " + (isValid ? "Valid" : "Invalid"));
        }
    }
    
    // Method to validate a hex color code using regex
    public static boolean validateHexColor(String color, String regex) {
        // Check if the color matches the pattern
        return color.matches(regex);
    }
}

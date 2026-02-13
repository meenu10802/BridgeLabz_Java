package collectionsandstreams.regex;

import java.util.regex.*;

/**
 * This class validates Social Security Numbers (SSN).
 * Valid SSN format: XXX-XX-XXXX (three digits, hyphen, two digits, hyphen, four digits)
 * 
 * Example valid: "123-45-6789"
 * Example invalid: "123456789" (missing hyphens)
 */
public class SSNValidation {
    
    // Main method to test SSN validation
    public static void main(String[] args) {
        // Define regex pattern for SSN: XXX-XX-XXXX format
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        
        // Test cases
        String[] testSSNs = {"123-45-6789", "123456789", "12-345-6789", "123-4-56789", "000-00-0000"};
        
        // Validate each SSN
        for (String ssn : testSSNs) {
            boolean isValid = validateSSN(ssn, regex);
            System.out.println("SSN: \"" + ssn + "\" -> " + (isValid ? "Valid" : "Invalid"));
        }
    }
    
    // Method to validate an SSN using regex
    public static boolean validateSSN(String ssn, String regex) {
        // Check if the SSN matches the pattern
        return ssn.matches(regex);
    }
}

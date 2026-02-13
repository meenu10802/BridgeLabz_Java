package collectionsandstreams.regex;

import java.util.regex.*;

/**
 * This class validates credit card numbers for Visa and MasterCard.
 * Visa: Starts with 4 and has 16 digits
 * MasterCard: Starts with 5 and has 16 digits
 * 
 * Example valid Visa: "4123456789012345"
 * Example valid MasterCard: "5123456789012345"
 * Example invalid: "3123456789012345" (doesn't start with 4 or 5)
 */
public class CreditCardValidation {
    
    // Main method to test credit card validation
    public static void main(String[] args) {
        // Test cases
        String[] testCards = {
            "4123456789012345",  // Valid Visa
            "5123456789012345",  // Valid MasterCard
            "3123456789012345",  // Invalid
            "412345678901234",   // Invalid (15 digits)
            "41234567890123456"  // Invalid (17 digits)
        };
        
        // Validate each credit card
        for (String card : testCards) {
            String cardType = validateCreditCard(card);
            System.out.println("Card: \"" + card + "\" -> " + cardType);
        }
    }
    
    // Method to validate credit card and return card type
    public static String validateCreditCard(String cardNumber) {
        // Regex pattern for Visa: starts with 4, followed by 15 digits
        String visaRegex = "^4\\d{15}$";
        
        // Regex pattern for MasterCard: starts with 5, followed by 15 digits
        String masterCardRegex = "^5\\d{15}$";
        
        // Check if it's a valid Visa card
        if (cardNumber.matches(visaRegex)) {
            return "Valid Visa";
        }
        
        // Check if it's a valid MasterCard
        if (cardNumber.matches(masterCardRegex)) {
            return "Valid MasterCard";
        }
        
        // Invalid card
        return "Invalid";
    }
}

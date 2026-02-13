package collectionsandstreams.regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class extracts currency values from a text.
 * Supports formats like $45.99, 10.50, $100, etc.
 * 
 * Example: "The price is $45.99, and the discount is 10.50."
 * Output: $45.99, 10.50
 */
public class CurrencyExtraction {
    
    // Main method to test currency extraction
    public static void main(String[] args) {
        // Sample text containing currency values
        String text = "The price is $45.99, and the discount is 10.50.";
        
        // Extract all currency values
        List<String> currencies = extractCurrencyValues(text);
        
        // Display extracted currency values
        System.out.println("Extracted Currency Values:");
        System.out.println(String.join(", ", currencies));
    }
    
    // Method to extract currency values from text using regex
    public static List<String> extractCurrencyValues(String text) {
        // Define regex pattern: optional $ sign, followed by digits, optional decimal point and digits
        String regex = "\\$?\\d+(?:\\.\\d{2})?";
        
        // Create pattern object
        Pattern pattern = Pattern.compile(regex);
        
        // Create matcher object
        Matcher matcher = pattern.matcher(text);
        
        // List to store extracted currency values
        List<String> currencies = new ArrayList<>();
        
        // Find all matches and add to list
        while (matcher.find()) {
            currencies.add(matcher.group());
        }
        
        return currencies;
    }
}

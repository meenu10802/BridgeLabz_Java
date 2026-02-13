package collectionsandstreams.regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class extracts all capitalized words from a sentence.
 * A capitalized word starts with an uppercase letter followed by lowercase letters.
 * 
 * Example: "The Eiffel Tower is in Paris and the Statue of Liberty is in New York."
 * Output: Eiffel, Tower, Paris, Statue, Liberty, New, York
 */
public class CapitalizedWordsExtraction {
    
    // Main method to test capitalized words extraction
    public static void main(String[] args) {
        // Sample text containing capitalized words
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        
        // Extract all capitalized words
        List<String> capitalizedWords = extractCapitalizedWords(text);
        
        // Display extracted words
        System.out.println("Extracted Capitalized Words:");
        System.out.println(String.join(", ", capitalizedWords));
    }
    
    // Method to extract all capitalized words from text using regex
    public static List<String> extractCapitalizedWords(String text) {
        // Define regex pattern: word starting with uppercase letter followed by lowercase letters
        String regex = "\\b[A-Z][a-z]+\\b";
        
        // Create pattern object
        Pattern pattern = Pattern.compile(regex);
        
        // Create matcher object
        Matcher matcher = pattern.matcher(text);
        
        // List to store extracted words
        List<String> words = new ArrayList<>();
        
        // Find all matches and add to list
        while (matcher.find()) {
            words.add(matcher.group());
        }
        
        return words;
    }
}

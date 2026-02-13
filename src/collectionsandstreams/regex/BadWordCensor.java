package collectionsandstreams.regex;

import java.util.regex.*;
import java.util.Arrays;
import java.util.List;

/**
 * This class censors bad words in a sentence by replacing them with asterisks.
 * Given a list of bad words, they are replaced with "****".
 * 
 * Example Input: "This is a damn bad example with some stupid words."
 * Expected Output: "This is a **** bad example with some **** words."
 */
public class BadWordCensor {
    
    // Main method to test bad word censoring
    public static void main(String[] args) {
        // Sample text with bad words
        String input = "This is a damn bad example with some stupid words.";
        
        // List of bad words to censor
        List<String> badWords = Arrays.asList("damn", "stupid", "bad");
        
        // Censor bad words
        String output = censorBadWords(input, badWords);
        
        // Display result
        System.out.println("Original: " + input);
        System.out.println("Result:   " + output);
    }
    
    // Method to censor bad words in text using regex
    public static String censorBadWords(String text, List<String> badWords) {
        // Start with the original text
        String result = text;
        
        // Replace each bad word with asterisks
        for (String badWord : badWords) {
            // Case-insensitive replacement using word boundaries
            String regex = "\\b" + Pattern.quote(badWord) + "\\b";
            result = result.replaceAll("(?i)" + regex, "****");
        }
        
        return result;
    }
}

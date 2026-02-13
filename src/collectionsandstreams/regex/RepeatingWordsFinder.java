package collectionsandstreams.regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

/**
 * This class finds repeating consecutive words in a sentence.
 * 
 * Example Input: "This is is a repeated repeated word test."
 * Expected Output: is, repeated
 */
public class RepeatingWordsFinder {
    
    // Main method to test repeating words finder
    public static void main(String[] args) {
        // Sample text with repeating words
        String input = "This is is a repeated repeated word test.";
        
        // Find repeating words
        List<String> repeatingWords = findRepeatingWords(input);
        
        // Display found repeating words
        System.out.println("Repeating Words:");
        System.out.println(String.join(", ", repeatingWords));
    }
    
    // Method to find repeating consecutive words using regex
    public static List<String> findRepeatingWords(String text) {
        // Define regex pattern to match word followed by same word (consecutive)
        String regex = "\\b(\\w+)\\s+\\1\\b";
        
        // Create pattern object
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        
        // Create matcher object
        Matcher matcher = pattern.matcher(text);
        
        // Set to store unique repeating words
        Set<String> repeatingWordsSet = new HashSet<>();
        
        // Find all matches and add to set
        while (matcher.find()) {
            // Add the repeated word (group 1) to set
            repeatingWordsSet.add(matcher.group(1));
        }
        
        // Convert set to list
        return new ArrayList<>(repeatingWordsSet);
    }
}

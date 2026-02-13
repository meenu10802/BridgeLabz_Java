package collectionsandstreams.regex;

import java.util.regex.*;

/**
 * This class replaces multiple consecutive spaces with a single space.
 * 
 * Example Input: "This    is    an    example    with    multiple    spaces."
 * Expected Output: "This is an example with multiple spaces."
 */
public class SpaceReplacement {
    
    // Main method to test space replacement
    public static void main(String[] args) {
        // Sample text with multiple spaces
        String input = "This    is    an    example    with    multiple    spaces.";
        
        // Replace multiple spaces with single space
        String output = replaceMultipleSpaces(input);
        
        // Display result
        System.out.println("Original: " + input);
        System.out.println("Result:   " + output);
    }
    
    // Method to replace multiple spaces with a single space using regex
    public static String replaceMultipleSpaces(String text) {
        // Replace two or more spaces with a single space
        String regex = "\\s+";
        
        // Replace all occurrences of multiple spaces with single space
        return text.replaceAll(regex, " ");
    }
}

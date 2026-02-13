package collectionsandstreams.regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * This class extracts programming language names from a text.
 * Common languages: Java, Python, JavaScript, Go, C++, C#, etc.
 * 
 * Example: "I love Java, Python, and JavaScript, but I haven't tried Go yet."
 * Output: Java, Python, JavaScript, Go
 */
public class ProgrammingLanguageExtraction {
    
    // Main method to test programming language extraction
    public static void main(String[] args) {
        // Sample text containing programming language names
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        
        // List of common programming languages
        List<String> languages = Arrays.asList("Java", "Python", "JavaScript", "Go", "C++", "C#", "Ruby", "PHP", "Swift", "Kotlin");
        
        // Extract programming languages from text
        List<String> extractedLanguages = extractProgrammingLanguages(text, languages);
        
        // Display extracted languages
        System.out.println("Extracted Programming Languages:");
        System.out.println(String.join(", ", extractedLanguages));
    }
    
    // Method to extract programming language names from text using regex
    public static List<String> extractProgrammingLanguages(String text, List<String> languages) {
        // List to store found languages
        List<String> foundLanguages = new ArrayList<>();
        
        // Check each language in the list
        for (String language : languages) {
            // Escape special regex characters in language name
            String escapedLanguage = Pattern.quote(language);
            
            // Create pattern with word boundaries to match whole words only
            Pattern pattern = Pattern.compile("\\b" + escapedLanguage + "\\b", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(text);
            
            // If language is found, add to list
            if (matcher.find()) {
                foundLanguages.add(language);
            }
        }
        
        return foundLanguages;
    }
}

package collectionsandstreams.regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class extracts HTTP and HTTPS links from a text.
 * Link format: http:// or https:// followed by domain and path
 * 
 * Example: "Visit https://www.google.com and http://example.org for more info."
 * Output: https://www.google.com, http://example.org
 */
public class LinkExtraction {
    
    // Main method to test link extraction
    public static void main(String[] args) {
        // Sample text containing links
        String text = "Visit https://www.google.com and http://example.org for more info.";
        
        // Extract all links
        List<String> links = extractLinks(text);
        
        // Display extracted links
        System.out.println("Extracted Links:");
        System.out.println(String.join(", ", links));
    }
    
    // Method to extract HTTP/HTTPS links from text using regex
    public static List<String> extractLinks(String text) {
        // Define regex pattern: http:// or https:// followed by domain and optional path
        String regex = "https?://[\\w.-]+(?:/[\\w./?=&%-]*)?";
        
        // Create pattern object
        Pattern pattern = Pattern.compile(regex);
        
        // Create matcher object
        Matcher matcher = pattern.matcher(text);
        
        // List to store extracted links
        List<String> links = new ArrayList<>();
        
        // Find all matches and add to list
        while (matcher.find()) {
            links.add(matcher.group());
        }
        
        return links;
    }
}

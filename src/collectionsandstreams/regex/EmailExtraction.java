package collectionsandstreams.regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class extracts all email addresses from a given text.
 * Email format: username@domain.com
 * 
 * Example: "Contact us at support@example.com and info@company.org"
 * Output: support@example.com, info@company.org
 */
public class EmailExtraction {
    
    // Main method to test email extraction
    public static void main(String[] args) {
        // Sample text containing email addresses
        String text = "Contact us at support@example.com and info@company.org";
        
        // Extract all email addresses
        List<String> emails = extractEmails(text);
        
        // Display extracted emails
        System.out.println("Extracted Email Addresses:");
        for (String email : emails) {
            System.out.println(email);
        }
    }
    
    // Method to extract all email addresses from text using regex
    public static List<String> extractEmails(String text) {
        // Define regex pattern for email: word characters, dots, hyphens @ domain with dots
        String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
        
        // Create pattern object
        Pattern pattern = Pattern.compile(regex);
        
        // Create matcher object
        Matcher matcher = pattern.matcher(text);
        
        // List to store extracted emails
        List<String> emails = new ArrayList<>();
        
        // Find all matches and add to list
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        
        return emails;
    }
}

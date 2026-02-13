package collectionsandstreams.regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class extracts dates in dd/mm/yyyy format from a text.
 * Date format: Two digits, slash, two digits, slash, four digits
 * 
 * Example: "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020."
 * Output: 12/05/2023, 15/08/2024, 29/02/2020
 */
public class DateExtraction {
    
    // Main method to test date extraction
    public static void main(String[] args) {
        // Sample text containing dates
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        
        // Extract all dates
        List<String> dates = extractDates(text);
        
        // Display extracted dates
        System.out.println("Extracted Dates:");
        System.out.println(String.join(", ", dates));
    }
    
    // Method to extract dates in dd/mm/yyyy format using regex
    public static List<String> extractDates(String text) {
        // Define regex pattern: dd/mm/yyyy format
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        
        // Create pattern object
        Pattern pattern = Pattern.compile(regex);
        
        // Create matcher object
        Matcher matcher = pattern.matcher(text);
        
        // List to store extracted dates
        List<String> dates = new ArrayList<>();
        
        // Find all matches and add to list
        while (matcher.find()) {
            dates.add(matcher.group());
        }
        
        return dates;
    }
}

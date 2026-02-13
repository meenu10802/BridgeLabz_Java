package collectionsandstreams.regex;

import java.util.regex.*;

/**
 * This class validates usernames based on specific rules:
 * - Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_)
 * - Must start with a letter
 * - Must be between 5 to 15 characters long
 * 
 * Example valid: "user_123"
 * Example invalid: "123user" (starts with number), "us" (too short)
 */
public class UsernameValidation {
    
    // Main method to test username validation
    public static void main(String[] args) {
        // Define the regex pattern for valid username
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        
        // Test cases
        String[] testUsernames = {"user_123", "123user", "us", "valid_user_123", "a"};
        
        // Validate each username
        for (String username : testUsernames) {
            boolean isValid = validateUsername(username, regex);
            System.out.println("Username: \"" + username + "\" -> " + (isValid ? "Valid" : "Invalid"));
        }
    }
    
    // Method to validate a username using regex
    public static boolean validateUsername(String username, String regex) {
        // Check if the username matches the pattern
        return username.matches(regex);
    }
}

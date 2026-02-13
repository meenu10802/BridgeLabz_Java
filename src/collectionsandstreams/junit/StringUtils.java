package collectionsandstreams.junit;

/**
 * Basic JUnit Test - Problem 2: String Utility Methods
 *
 * This class provides utility methods for string manipulation: reversing
 * a string, checking if a string is a palindrome, and converting to uppercase.
 * Handles null inputs appropriately.
 */
public class StringUtils {

    // Returns the reverse of the given string; returns null if input is null
    public String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    // Returns true if the string reads the same forward and backward (case-insensitive)
    public boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    // Converts the string to uppercase; returns null if input is null
    public String toUpperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }
}

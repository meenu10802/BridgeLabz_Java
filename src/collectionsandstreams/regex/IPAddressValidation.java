package collectionsandstreams.regex;

import java.util.regex.*;

/**
 * This class validates IPv4 addresses.
 * Valid IPv4 format: Four groups of numbers (0-255) separated by dots.
 * 
 * Example valid: "192.168.1.1", "10.0.0.1"
 * Example invalid: "256.1.1.1" (number exceeds 255), "192.168.1" (only 3 groups)
 */
public class IPAddressValidation {
    
    // Main method to test IP address validation
    public static void main(String[] args) {
        // Define regex pattern for IPv4: four groups of 0-255 separated by dots
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        
        // Test cases
        String[] testIPs = {"192.168.1.1", "10.0.0.1", "256.1.1.1", "192.168.1", "0.0.0.0", "255.255.255.255"};
        
        // Validate each IP address
        for (String ip : testIPs) {
            boolean isValid = validateIPAddress(ip, regex);
            System.out.println("IP Address: \"" + ip + "\" -> " + (isValid ? "Valid" : "Invalid"));
        }
    }
    
    // Method to validate an IP address using regex
    public static boolean validateIPAddress(String ip, String regex) {
        // Check if the IP matches the pattern
        return ip.matches(regex);
    }
}

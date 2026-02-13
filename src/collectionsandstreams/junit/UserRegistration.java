package collectionsandstreams.junit;

/**
 * Advanced JUnit - Problem 5: Testing User Registration
 *
 * This class handles user registration with username, email, and password.
 * Throws IllegalArgumentException for invalid inputs (empty/null, invalid format).
 */
public class UserRegistration {

    // Registers a user; throws IllegalArgumentException for invalid inputs
    public void registerUser(String username, String email, String password) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Password must be at least 6 characters");
        }
        // Registration logic would go here (e.g., save to database)
    }
}

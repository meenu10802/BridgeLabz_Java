package collectionsandstreams.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test cases for UserRegistration class.
 *
 * Verifies valid registrations succeed and invalid inputs (username, email,
 * password) throw IllegalArgumentException appropriately.
 */
class UserRegistrationTest {

    private UserRegistration userRegistration;

    // Initialize UserRegistration before each test
    @BeforeEach
    void setUp() {
        userRegistration = new UserRegistration();
    }

    // Test valid registration does not throw
    @Test
    @DisplayName("Should register user with valid inputs")
    void testValidRegistration() {
        assertDoesNotThrow(() -> userRegistration.registerUser("john_doe", "john@example.com", "password123"));
    }

    // Test invalid username throws exception
    @Test
    @DisplayName("Should throw for null username")
    void testInvalidUsernameNull() {
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser(null, "a@b.com", "pass123"));
    }

    // Test empty username throws exception
    @Test
    @DisplayName("Should throw for empty username")
    void testInvalidUsernameEmpty() {
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("", "a@b.com", "pass123"));
    }

    // Test invalid email throws exception
    @Test
    @DisplayName("Should throw for invalid email")
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("user", "invalidemail", "pass123"));
    }

    // Test short password throws exception
    @Test
    @DisplayName("Should throw for password shorter than 6 characters")
    void testInvalidPasswordShort() {
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("user", "a@b.com", "12345"));
    }

    // Test null password throws exception
    @Test
    @DisplayName("Should throw for null password")
    void testInvalidPasswordNull() {
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("user", "a@b.com", null));
    }
}

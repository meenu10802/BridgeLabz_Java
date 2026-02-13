package collectionsandstreams.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test cases for PasswordValidator class.
 *
 * Verifies valid passwords (8+ chars, 1 uppercase, 1 digit) pass and
 * invalid passwords fail validation.
 */
class PasswordValidatorTest {

    private PasswordValidator passwordValidator;

    // Initialize PasswordValidator before each test
    @BeforeEach
    void setUp() {
        passwordValidator = new PasswordValidator();
    }

    // Test valid password with all requirements
    @Test
    @DisplayName("Should return true for valid password")
    void testValidPassword() {
        assertTrue(passwordValidator.isValid("Password1"));
        assertTrue(passwordValidator.isValid("MyPass123"));
    }

    // Test invalid - too short
    @Test
    @DisplayName("Should return false for password shorter than 8 characters")
    void testInvalidTooShort() {
        assertFalse(passwordValidator.isValid("Pass1"));
    }

    // Test invalid - no uppercase
    @Test
    @DisplayName("Should return false for password without uppercase")
    void testInvalidNoUppercase() {
        assertFalse(passwordValidator.isValid("password123"));
    }

    // Test invalid - no digit
    @Test
    @DisplayName("Should return false for password without digit")
    void testInvalidNoDigit() {
        assertFalse(passwordValidator.isValid("PasswordOnly"));
    }

    // Test null password
    @Test
    @DisplayName("Should return false for null password")
    void testNullPassword() {
        assertFalse(passwordValidator.isValid(null));
    }
}

package collectionsandstreams.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test cases for the StringUtils class.
 *
 * Verifies that reverse, isPalindrome, and toUpperCase methods work correctly
 * with various inputs including edge cases.
 */
class StringUtilsTest {

    private StringUtils stringUtils;

    // Initialize StringUtils instance before each test for isolation
    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }

    // Test reverse with regular string
    @Test
    @DisplayName("Should reverse a string correctly")
    void testReverse() {
        assertEquals("olleh", stringUtils.reverse("hello"));
    }

    // Test reverse with empty string
    @Test
    @DisplayName("Should return empty string when reversing empty string")
    void testReverseEmptyString() {
        assertEquals("", stringUtils.reverse(""));
    }

    // Test reverse with single character
    @Test
    @DisplayName("Should return same character when reversing single character")
    void testReverseSingleChar() {
        assertEquals("a", stringUtils.reverse("a"));
    }

    // Test isPalindrome with valid palindrome
    @Test
    @DisplayName("Should return true for palindrome")
    void testIsPalindromeValid() {
        assertTrue(stringUtils.isPalindrome("racecar"));
        assertTrue(stringUtils.isPalindrome("A man a plan a canal Panama"));
    }

    // Test isPalindrome with non-palindrome
    @Test
    @DisplayName("Should return false for non-palindrome")
    void testIsPalindromeInvalid() {
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    // Test toUpperCase conversion
    @Test
    @DisplayName("Should convert string to uppercase correctly")
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
    }

    // Test toUpperCase with mixed case
    @Test
    @DisplayName("Should convert mixed case string to uppercase")
    void testToUpperCaseMixedCase() {
        assertEquals("JAVA", stringUtils.toUpperCase("Java"));
    }
}

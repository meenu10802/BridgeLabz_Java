package collectionsandstreams.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test cases for DateFormatter class.
 *
 * Verifies valid dates are converted from yyyy-MM-dd to dd-MM-yyyy and
 * invalid dates throw appropriate exceptions.
 */
class DateFormatterTest {

    private DateFormatter dateFormatter;

    // Initialize DateFormatter before each test
    @BeforeEach
    void setUp() {
        dateFormatter = new DateFormatter();
    }

    // Test valid date conversion
    @Test
    @DisplayName("Should convert valid yyyy-MM-dd to dd-MM-yyyy")
    void testValidDateConversion() {
        assertEquals("13-02-2025", dateFormatter.formatDate("2025-02-13"));
    }

    // Test another valid date
    @Test
    @DisplayName("Should handle various valid dates")
    void testValidDateVarious() {
        assertEquals("01-01-2020", dateFormatter.formatDate("2020-01-01"));
        assertEquals("31-12-1999", dateFormatter.formatDate("1999-12-31"));
    }

    // Test invalid date format throws exception
    @Test
    @DisplayName("Should throw exception for invalid date format")
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate("13-02-2025"));
    }

    // Test invalid date value throws exception
    @Test
    @DisplayName("Should throw exception for invalid date value")
    void testInvalidDateValue() {
        assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate("2025-13-45"));
    }

    // Test null input throws exception
    @Test
    @DisplayName("Should throw exception for null input")
    void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate(null));
    }

    // Test empty string throws exception
    @Test
    @DisplayName("Should throw exception for empty string")
    void testEmptyInput() {
        assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate(""));
    }
}

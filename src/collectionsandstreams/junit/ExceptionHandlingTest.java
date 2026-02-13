package collectionsandstreams.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test cases for exception handling.
 *
 * Verifies that the divide method properly throws ArithmeticException
 * when the divisor is zero.
 */
class ExceptionHandlingTest {

    private ExceptionHandling exceptionHandling;

    // Initialize ExceptionHandling instance before each test
    @BeforeEach
    void setUp() {
        exceptionHandling = new ExceptionHandling();
    }

    // Test that ArithmeticException is thrown when dividing by zero
    @Test
    @DisplayName("Should throw ArithmeticException when divisor is zero")
    void testDivideByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> exceptionHandling.divide(10, 0));
    }

    // Test that divide works normally when divisor is non-zero
    @Test
    @DisplayName("Should return correct result when divisor is non-zero")
    void testDivideWithValidDivisor() {
        assertEquals(5, exceptionHandling.divide(10, 2));
    }

    // Test exception message content
    @Test
    @DisplayName("Should throw ArithmeticException with correct message")
    void testDivideByZeroExceptionMessage() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> exceptionHandling.divide(5, 0));
        assertTrue(exception.getMessage().contains("Cannot divide by zero"));
    }
}

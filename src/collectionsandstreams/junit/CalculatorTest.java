package collectionsandstreams.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test cases for the Calculator class.
 *
 * Tests add, subtract, multiply, and divide methods with various inputs.
 * Includes bonus test for division by zero to verify proper exception handling.
 */
class CalculatorTest {

    private final Calculator calculator = new Calculator();

    // Test add method with positive numbers
    @Test
    @DisplayName("Should add two positive numbers correctly")
    void testAddPositiveNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    // Test add method with negative numbers
    @Test
    @DisplayName("Should add negative numbers correctly")
    void testAddNegativeNumbers() {
        assertEquals(-5, calculator.add(-2, -3));
    }

    // Test subtract method
    @Test
    @DisplayName("Should subtract two numbers correctly")
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    // Test multiply method
    @Test
    @DisplayName("Should multiply two numbers correctly")
    void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5));
    }

    // Test divide method with valid divisor
    @Test
    @DisplayName("Should divide two numbers correctly")
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }

    // Bonus: Test division by zero throws ArithmeticException
    @Test
    @DisplayName("Should throw ArithmeticException when dividing by zero")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    // Bonus: Verify exception message for division by zero
    @Test
    @DisplayName("Should throw ArithmeticException with correct message when dividing by zero")
    void testDivideByZeroExceptionMessage() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

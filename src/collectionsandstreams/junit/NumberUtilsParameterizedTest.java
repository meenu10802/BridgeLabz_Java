package collectionsandstreams.junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit parameterized test cases for NumberUtils.isEven method.
 *
 * Uses @ParameterizedTest to test the isEven method with multiple values
 * (2, 4, 6, 7, 9) in a single test method.
 */
class NumberUtilsParameterizedTest {

    private final NumberUtils numberUtils = new NumberUtils();

    // Parameterized test for even numbers - should return true
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 0, -2})
    void testIsEvenReturnsTrueForEvenNumbers(int number) {
        assertTrue(numberUtils.isEven(number));
    }

    // Parameterized test for odd numbers - should return false
    @ParameterizedTest
    @ValueSource(ints = {7, 9, 1, 3, -1})
    void testIsEvenReturnsFalseForOddNumbers(int number) {
        assertFalse(numberUtils.isEven(number));
    }

    // Combined parameterized test with mixed values (2, 4, 6, 7, 9) as specified
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testIsEvenWithEvenValues(int number) {
        assertTrue(numberUtils.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testIsEvenWithOddValues(int number) {
        assertFalse(numberUtils.isEven(number));
    }
}

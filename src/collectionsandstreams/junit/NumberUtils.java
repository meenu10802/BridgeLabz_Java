package collectionsandstreams.junit;

/**
 * Basic JUnit Test - Problem 6: Parameterized Tests
 *
 * This class provides utility methods for number operations. The isEven method
 * returns true if the given number is even (divisible by 2), false otherwise.
 * Used to demonstrate @ParameterizedTest in JUnit.
 */
public class NumberUtils {

    // Returns true if the number is even, false if odd
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}

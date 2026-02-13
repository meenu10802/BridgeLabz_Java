package collectionsandstreams.junit;

/**
 * Basic JUnit Test - Problem 4: Testing Exception Handling
 *
 * This class contains a divide method that throws ArithmeticException when
 * the divisor (b) is zero. Used to demonstrate and verify exception handling
 * in JUnit tests.
 */
public class ExceptionHandling {

    // Divides a by b; throws ArithmeticException if b is zero
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

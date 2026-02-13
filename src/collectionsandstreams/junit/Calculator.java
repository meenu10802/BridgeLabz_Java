package collectionsandstreams.junit;

/**
 * Basic JUnit Test - Problem 1: Calculator Class
 *
 * This class provides basic arithmetic operations: addition, subtraction,
 * multiplication, and division. The divide method handles division by zero
 * by throwing ArithmeticException to ensure proper exception handling.
 */
public class Calculator {

    // Adds two integers and returns the sum
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts second integer from first and returns the difference
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplies two integers and returns the product
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divides first integer by second; throws ArithmeticException if divisor is zero
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

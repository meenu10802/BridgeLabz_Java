package collectionsandstreams.junit;

/**
 * Advanced JUnit - Problem 3: Testing Temperature Converter
 *
 * This class converts between Celsius and Fahrenheit using standard formulas:
 * F = C * 9/5 + 32 and C = (F - 32) * 5/9.
 */
public class TemperatureConverter {

    // Converts Celsius to Fahrenheit: F = C * 9/5 + 32
    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // Converts Fahrenheit to Celsius: C = (F - 32) * 5/9
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

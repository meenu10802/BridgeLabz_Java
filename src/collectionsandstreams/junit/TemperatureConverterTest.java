package collectionsandstreams.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test cases for TemperatureConverter class.
 *
 * Validates Celsius to Fahrenheit and Fahrenheit to Celsius conversions
 * using known reference values.
 */
class TemperatureConverterTest {

    private TemperatureConverter temperatureConverter;

    // Initialize TemperatureConverter before each test
    @BeforeEach
    void setUp() {
        temperatureConverter = new TemperatureConverter();
    }

    // Test Celsius to Fahrenheit - 0°C = 32°F
    @Test
    @DisplayName("Should convert 0 Celsius to 32 Fahrenheit")
    void testCelsiusToFahrenheitZero() {
        assertEquals(32.0, temperatureConverter.celsiusToFahrenheit(0), 0.01);
    }

    // Test Celsius to Fahrenheit - 100°C = 212°F
    @Test
    @DisplayName("Should convert 100 Celsius to 212 Fahrenheit")
    void testCelsiusToFahrenheit100() {
        assertEquals(212.0, temperatureConverter.celsiusToFahrenheit(100), 0.01);
    }

    // Test Fahrenheit to Celsius - 32°F = 0°C
    @Test
    @DisplayName("Should convert 32 Fahrenheit to 0 Celsius")
    void testFahrenheitToCelsius32() {
        assertEquals(0.0, temperatureConverter.fahrenheitToCelsius(32), 0.01);
    }

    // Test Fahrenheit to Celsius - 212°F = 100°C
    @Test
    @DisplayName("Should convert 212 Fahrenheit to 100 Celsius")
    void testFahrenheitToCelsius212() {
        assertEquals(100.0, temperatureConverter.fahrenheitToCelsius(212), 0.01);
    }

    // Test round-trip conversion
    @Test
    @DisplayName("Should convert back correctly (round-trip)")
    void testRoundTripConversion() {
        double celsius = 25.0;
        double fahrenheit = temperatureConverter.celsiusToFahrenheit(celsius);
        assertEquals(celsius, temperatureConverter.fahrenheitToCelsius(fahrenheit), 0.01);
    }
}

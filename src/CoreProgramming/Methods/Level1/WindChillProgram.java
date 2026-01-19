/*
 * This program calculates the Wind Chill Temperature (how cold it feels)
 * based on the actual air temperature and wind speed using the official formula.
 * It demonstrates creating a reusable method for scientific calculations
 * and working with floating-point math and the Math.pow() function.
 */
package CoreProgramming.Methods.Level1;

import java.util.Scanner;

public class WindChillProgram{

    /**
     * Calculates wind chill temperature using the formula
     * @param temperature air temperature in Fahrenheit
     * @param windSpeed wind speed in miles per hour
     * @return calculated wind chill temperature
     */
    public double calculateWindChill(double temperature, double windSpeed) {
        // Using the official wind chill formula
        return 35.74 +
                0.6215 * temperature +
                (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        // Scanner is used to read temperature and wind speed from user
        Scanner scanner = new Scanner(System.in);

        // Reading temperature value (in Fahrenheit)
        double temperature = scanner.nextDouble();

        // Reading wind speed value (in miles per hour)
        double windSpeed = scanner.nextDouble();

        // Creating object because the method is non-static
        WindChillProgram calculator = new WindChillProgram();

        // Calculating wind chill temperature
        double result = calculator.calculateWindChill(temperature, windSpeed);

        // Printing the calculated wind chill value
        System.out.println(result);

        scanner.close();
    }
}
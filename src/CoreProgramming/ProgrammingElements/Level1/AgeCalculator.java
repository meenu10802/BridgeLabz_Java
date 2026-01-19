/*
 * This class calculates Harry's current age based on birth year
 */
package CoreProgramming.ProgrammingElements.Level1;

public class AgeCalculator {
    public static void main(String[] args) {
        int birthYear = 2000;
        int currentYear = 2024;

        // Calculate age
        int age = currentYear - birthYear;

        // Display the result
        System.out.println("Harry's age in 2024 is " + age);
    }
}
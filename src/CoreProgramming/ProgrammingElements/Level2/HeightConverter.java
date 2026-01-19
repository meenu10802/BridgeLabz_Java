/*
 * This class converts height from centimeters to feet and inches
 */
package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read height in centimeters
        double heightCm = sc.nextDouble();

        // Convert to total inches
        double totalInches = heightCm / 2.54;

        // Calculate feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Display converted height
        System.out.println("Your Height in cm is " + heightCm +
                " while in feet is " + feet +
                " and inches is " + inches);

        sc.close();
    }
}
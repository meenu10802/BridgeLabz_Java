/*
 * This class converts distance from feet to yards and miles
 */
package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

public class FeetToYardsAndMilesConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read distance in feet
        double feet = sc.nextDouble();

        // Convert feet to yards
        double yards = feet / 3;

        // Convert yards to miles
        double miles = yards / 1760;

        // Display converted values
        System.out.println("The distance in yards is " + yards +
                " while the distance in miles is " + miles);

        sc.close();
    }
}
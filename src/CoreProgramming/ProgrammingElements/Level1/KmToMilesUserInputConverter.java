/*
 * This class converts user-entered kilometers to miles
 */
package CoreProgramming.ProgrammingElements.Level1;

import java.util.Scanner;

public class KmToMilesUserInputConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read distance in kilometers from user
        double kilometers = sc.nextDouble();

        // Convert to miles
        double miles = kilometers / 1.6;

        // Display converted distance
        System.out.println("The total miles is " + miles +
                " mile for the given " + kilometers + " km");

        sc.close();
    }
}
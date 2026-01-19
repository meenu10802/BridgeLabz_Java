/*
 * This program calculates how many rounds an athlete needs to run
 * to complete 5000 meters given the sides of a triangular track.
 * It demonstrates using a method to calculate perimeter and rounds.
 */
package CoreProgramming.Methods.Level1;

import java.util.Scanner;

public class AthleteRoundsCalculator {

    /**
     * Calculates number of rounds needed to complete 5000 meters
     * @param side1 first side of triangle
     * @param side2 second side
     * @param side3 third side
     * @return number of rounds
     */
    public double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000.0 / perimeter;
    }

    public static void main(String[] args) {
        // Scanner used to get input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side 1:");
        double side1 = sc.nextDouble();

        System.out.println("Enter side 2:");
        double side2 = sc.nextDouble();

        System.out.println("Enter side 3:");
        double side3 = sc.nextDouble();

        AthleteRoundsCalculator athlete = new AthleteRoundsCalculator();

        double rounds = athlete.calculateRounds(side1, side2, side3);

        // Printing the calculated number of rounds
        System.out.println(rounds);

        sc.close();
    }
}
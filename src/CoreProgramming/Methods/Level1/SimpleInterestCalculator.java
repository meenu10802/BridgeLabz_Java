/*
 * This program calculates Simple Interest using formula (P*R*T)/100.
 * It demonstrates how to create a reusable method for financial calculations.
 */
package CoreProgramming.Methods.Level1;

import java.util.Scanner;

public class SimpleInterestCalculator {

    // Method calculates simple interest using principal, rate and time
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        // Scanner is used to get input values from user
        Scanner scanner = new Scanner(System.in);

        // Reading principal amount
        double principal = scanner.nextDouble();
        // Reading rate of interest
        double rate = scanner.nextDouble();
        // Reading time period
        double time = scanner.nextDouble();

        SimpleInterestCalculator calc = new SimpleInterestCalculator();

        // Calculating simple interest
        double interest = calc.calculateSimpleInterest(principal, rate, time);

        // Printing detailed result with all input values
        System.out.println("The Simple Interest is " + interest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);

        scanner.close();
    }
}
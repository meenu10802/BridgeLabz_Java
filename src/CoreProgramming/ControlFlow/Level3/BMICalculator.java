/*
 * This program calculates Body Mass Index (BMI) and classifies a person
 * into one of four weight categories: Underweight, Normal, Overweight, Obese.
 * It demonstrates real-world application of mathematical formulas and range-based classification.
 */
package CoreProgramming.ControlFlow.Level3;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read weight (kg) and height (cm)
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();

        // Convert height to meters
        double heightM = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightM * heightM);

        // Display BMI value
        System.out.println(bmi);

        // Classify weight status based on BMI ranges
        if (bmi < 18.4) {
            System.out.println("Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        sc.close();
    }
}
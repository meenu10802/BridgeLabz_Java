/**
 * Class Name: BMICalculatorArray
 * Purpose:    Calculate BMI for multiple people and determine their weight status
 * Input:      Number of people, then for each: height (cm) and weight (kg)
 * Output:     For each person: height weight BMI status
 * Note:       Re-asks input if height or weight <= 0
 */
package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

public class BMICalculatorArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get number of people
        System.out.println("Enter number of people");
        int n = sc.nextInt();

        // Arrays to store weight, height, BMI and status
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

        // Read height and weight for each person
        for (int i = 0; i < n; i++) {
            System.out.println("Enter height and weight of person " + (i + 1));
            heights[i] = sc.nextDouble();
            weights[i] = sc.nextDouble();

            // Re-ask if invalid input
            if (weights[i] <= 0 || heights[i] <= 0) {
                i--;
            }
        }

        // Calculate BMI and determine status for each person
        for (int i = 0; i < n; i++) {
            bmis[i] = weights[i] / ((heights[i] / 100) * (heights[i] / 100));

            if (bmis[i] < 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }

            // Display result for each person
            System.out.println(heights[i] + " " + weights[i] + " " + bmis[i] + " " + statuses[i]);
        }

        sc.close();
    }
}
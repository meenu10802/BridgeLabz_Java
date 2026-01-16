/*
 * This program calculates BMI for 10 people and assigns status.
 * It uses methods to compute BMI array and status array.
 * Demonstrates processing 2D array input and returning arrays.
 */
package CoreProgramming.Methods.Level2;

import java.util.Scanner;

public class BMICalculator {

    // Method calculates BMI for each person from weight/height data
    public static double[] calculateBMI(double[][] data) {
        double[] bmi = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            double heightM = data[i][1] / 100;
            bmi[i] = data[i][0] / (heightM * heightM);
        }
        return bmi;
    }

    // Method assigns weight status based on BMI values
    public static String[] findStatus(double[] bmi) {
        String[] status = new String[bmi.length];
        for (int i = 0; i < bmi.length; i++) {
            if (bmi[i] < 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        // Scanner is used to read weight and height for 10 people
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        // Reading weight and height for each person
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble(); // weight
            data[i][1] = sc.nextDouble(); // height in cm
        }

        // Calculating BMI values
        double[] bmi = calculateBMI(data);

        // Getting status for each BMI
        String[] status = findStatus(bmi);

        // Printing BMI and status for each person
        for (int i = 0; i < 10; i++) {
            System.out.println(bmi[i]);
            System.out.println(status[i]);
        }

        sc.close();
    }
}
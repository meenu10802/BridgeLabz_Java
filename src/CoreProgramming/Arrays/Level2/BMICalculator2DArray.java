/**
 * Purpose:    Calculate BMI using 2D array for multiple persons
 * Input:      Number of persons, then height and weight for each
 * Output:     height weight BMI status for each person
 */
package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

public class BMICalculator2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of persons");
        int n = sc.nextInt();

        // 2D array: [person][height, weight, bmi]
        double[][] personData = new double[n][3];
        String[] statuses = new String[n];

        // Input height and weight
        for (int i = 0; i < n; i++) {
            System.out.println("Enter height and weight of person " + (i + 1));
            personData[i][0] = sc.nextDouble(); // height
            personData[i][1] = sc.nextDouble(); // weight

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                i--;
            }
        }

        // Calculate BMI and determine status
        for (int i = 0; i < n; i++) {
            personData[i][2] = personData[i][1] / ((personData[i][0] / 100) * (personData[i][0] / 100));

            if (personData[i][2] < 18.4) {
                statuses[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                statuses[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }

            System.out.println(personData[i][0] + " " + personData[i][1] + " " +
                    personData[i][2] + " " + statuses[i]);
        }

        sc.close();
    }
}
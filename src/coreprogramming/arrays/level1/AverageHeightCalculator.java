// File: AverageHeightCalculator.java
/**
 * Class Name: AverageHeightCalculator
 * Purpose:    Calculate average height of exactly 11 students
 * Input:      11 double values (heights in cm)
 * Output:     Average height (one decimal number)
 */
package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

public class AverageHeightCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store heights of 11 students
        double[] heights = new double[11];
        double sum = 0;

        // Read 11 height values
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        // Calculate and display average height
        System.out.println(sum / heights.length);

        sc.close();
    }
}
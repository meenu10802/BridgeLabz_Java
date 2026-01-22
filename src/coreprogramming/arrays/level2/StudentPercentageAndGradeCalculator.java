/**
 * Purpose:    Calculate percentage and grade for multiple students
 * Input:      Number of students, then physics, chemistry, math marks for each
 * Output:     Percentage and grade (A/B/C/D/E/R) for each student
 * Note:       Re-asks if any mark is negative
 */
package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

public class StudentPercentageAndGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter physics chemistry and math marks of student " + (i + 1));
            physics[i] = sc.nextInt();
            chemistry[i] = sc.nextInt();
            maths[i] = sc.nextInt();

            // Re-ask if any mark is negative
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                i--;
            }
        }

        // Calculate percentage and assign grade
        for (int i = 0; i < n; i++) {
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percentages[i] >= 80) grades[i] = "A";
            else if (percentages[i] >= 70) grades[i] = "B";
            else if (percentages[i] >= 60) grades[i] = "C";
            else if (percentages[i] >= 50) grades[i] = "D";
            else if (percentages[i] >= 40) grades[i] = "E";
            else grades[i] = "R";

            System.out.println(percentages[i] + " " + grades[i]);
        }

        sc.close();
    }
}
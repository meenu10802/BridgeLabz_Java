/**
 * Purpose:    Store marks in 2D array and calculate percentage & grade
 * Input:      Number of students, then 3 subject marks for each
 * Output:     Detailed result for each student: percentage and grade
 */
package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

public class StudentMarks2DGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students");
        int n = sc.nextInt();

        // 2D array: rows = students, columns = subjects
        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        // Input marks for each student and each subject
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter marks of student " + (i + 1));
                marks[i][j] = sc.nextInt();

                // Re-ask if negative marks
                if (marks[i][j] < 0) {
                    j--;
                }
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentages[i] >= 80) grades[i] = "A";
            else if (percentages[i] >= 70) grades[i] = "B";
            else if (percentages[i] >= 60) grades[i] = "C";
            else if (percentages[i] >= 50) grades[i] = "D";
            else if (percentages[i] >= 40) grades[i] = "E";
            else grades[i] = "R";

            System.out.println("Student " + (i + 1) + " got " + percentages[i] +
                    " percentage and grade is " + grades[i]);
        }

        sc.close();
    }
}
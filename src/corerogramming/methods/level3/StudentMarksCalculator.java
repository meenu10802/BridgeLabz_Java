/*
 * This program generates random marks for N students, calculates sum, average, percentage.
 * Demonstrates 2D array random generation and calculation methods.
 */
package CoreProgramming.Methods.Level3;

public class StudentMarksCalculator {

    // Method generates random marks (10-100) for N students in 3 subjects
    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int) (Math.random() * 90) + 10;
            }
        }
        return marks;
    }

    // Method calculates sum, average, percentage for each student
    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            double sum = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = sum / 3;
            double per = (sum / 300) * 100;
            results[i][0] = sum;
            results[i][1] = avg;
            results[i][2] = per;
        }
        return results;
    }

    public static void main(String[] args) {
        // Generating marks for 5 students
        int[][] marks = generateMarks(5);

        // Calculating results
        double[][] results = calculateResults(marks);

        // Printing marks, sum, avg, percentage for each
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t" +
                    results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
        }
    }
}
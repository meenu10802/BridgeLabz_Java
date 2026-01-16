package CoreProgramming.Strings.Level2;

import java.util.Random;

/*
 * This program generates random PCM marks for students,
 * calculates total, average, percentage, and assigns grades,
 * then displays complete scorecard in tabular format.
 */
public class StudentPCMScorecardGenerator {

    // Method generates random 2-digit marks for PCM for given students
    public static int[][] generateRandomMarks(int numStudents) {
        Random random = new Random();
        int[][] marks = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = random.nextInt(61) + 40; // Physics 40-100
            marks[i][1] = random.nextInt(61) + 40; // Chemistry 40-100
            marks[i][2] = random.nextInt(61) + 40; // Maths 40-100
        }
        return marks;
    }

    // Method calculates total, average, percentage for each student
    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method assigns grade based on percentage
    public static String[] assignGrades(double[] percentages) {
        String[] grades = new String[percentages.length];

        for (int i = 0; i < percentages.length; i++) {
            double p = percentages[i];
            if (p >= 90) grades[i] = "A+";
            else if (p >= 80) grades[i] = "A";
            else if (p >= 70) grades[i] = "B";
            else if (p >= 60) grades[i] = "C";
            else if (p >= 50) grades[i] = "D";
            else if (p >= 40) grades[i] = "E";
            else grades[i] = "F";
        }
        return grades;
    }

    // Method displays complete scorecard in tabular format
    public static void displayScorecard(int[][] marks, double[][] results, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\t%s%n",
                    i+1,
                    marks[i][0], marks[i][1], marks[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    grades[i]);
        }
    }

    public static void main(String[] args) {
        final int NUMBER_OF_STUDENTS = 5;

        // Generating random marks
        int[][] marks = generateRandomMarks(NUMBER_OF_STUDENTS);

        // Calculating results
        double[][] results = calculateResults(marks);

        // Extracting percentages for grade assignment
        double[] percentages = new double[results.length];
        for (int i = 0; i < results.length; i++) {
            percentages[i] = results[i][2];
        }

        // Assigning grades
        String[] grades = assignGrades(percentages);

        // Displaying complete scorecard
        displayScorecard(marks, results, grades);
    }
}
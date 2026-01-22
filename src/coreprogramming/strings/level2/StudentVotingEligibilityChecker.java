package CoreProgramming.Strings.Level2;

import java.util.Random;
import java.util.Scanner;

/*
 * This program generates random 2-digit ages for 10 students,
 * checks voting eligibility (age >= 18), and displays results in tabular format.
 * Demonstrates random generation, validation, and 2D array usage.
 */
public class StudentVotingEligibilityChecker {

    // Method generates random 2-digit ages (10–99) for given number of students
    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10; // 10 to 99
        }
        return ages;
    }

    // Method creates 2D array with age and voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method displays 2D array in tabular format
    public static void displayEligibilityTable(String[][] table) {
        System.out.println("Student\tAge\tEligibility");
        System.out.println("------\t---\t-----------");
        for (int i = 0; i < table.length; i++) {
            System.out.println((i+1) + "\t" + table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        final int NUMBER_OF_STUDENTS = 10;

        // Generating random ages
        int[] ages = generateRandomAges(NUMBER_OF_STUDENTS);

        // Checking voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);

        // Displaying result in table
        displayEligibilityTable(eligibility);
    }
}
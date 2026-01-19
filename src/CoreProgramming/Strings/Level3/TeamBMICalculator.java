package CoreProgramming.Strings.Level3;

import java.util.Scanner;

/*
 * This program calculates Body Mass Index (BMI) for 10 team members
 * and displays height, weight, BMI, and weight status for each person.
 * It demonstrates 2D array input handling, BMI formula, and status classification.
 */
public class TeamBMICalculator {

    // Method calculates BMI and returns status for one person
    public static String[] calculateBMIAndStatus(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weightKg / (heightM * heightM);

        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{
                String.format("%.2f", heightCm),
                String.format("%.2f", weightKg),
                String.format("%.2f", bmi),
                status
        };
    }

    // Method creates 2D result array with height, weight, BMI, and status for all members
    public static String[][] processTeamData(double[][] teamData) {
        String[][] results = new String[teamData.length][4];

        for (int i = 0; i < teamData.length; i++) {
            double weight = teamData[i][0];
            double height = teamData[i][1];
            results[i] = calculateBMIAndStatus(weight, height);
        }
        return results;
    }

    // Method displays BMI results in tabular format
    public static void displayBMITable(String[][] results) {
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < results.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t%s%n",
                    i + 1, results[i][0], results[i][1], results[i][2], results[i][3]);
        }
    }

    public static void main(String[] args) {
        final int TEAM_SIZE = 10;
        // Scanner is used to read weight and height for 10 members
        Scanner sc = new Scanner(System.in);

        double[][] teamData = new double[TEAM_SIZE][2];

        System.out.println("Enter weight(kg) and height(cm) for " + TEAM_SIZE + " members:");
        for (int i = 0; i < TEAM_SIZE; i++) {
            System.out.print("Member " + (i + 1) + " - Weight (kg): ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Member " + (i + 1) + " - Height (cm): ");
            teamData[i][1] = sc.nextDouble();
        }

        // Processing data to get BMI and status
        String[][] results = processTeamData(teamData);

        // Displaying results in table format
        displayBMITable(results);

        sc.close();
    }
}
/**
 * Purpose:    Calculate bonus and new salary for 10 employees
 * Input:      Salary and years of service for 10 employees
 * Output:     Total bonus, total old salary, total new salary
 * Note:       5% bonus if >5 years, 2% otherwise
 */
package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salaries = new double[10];
        double[] years = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input salary and years for each employee
        for (int i = 0; i < 10; i++) {
            salaries[i] = sc.nextDouble();
            years[i] = sc.nextDouble();

            // Re-ask if invalid input
            if (salaries[i] <= 0 || years[i] < 0) {
                i--;
            }
        }

        // Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }

            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display final totals
        System.out.println(totalBonus);
        System.out.println(totalOldSalary);
        System.out.println(totalNewSalary);

        sc.close();
    }
}
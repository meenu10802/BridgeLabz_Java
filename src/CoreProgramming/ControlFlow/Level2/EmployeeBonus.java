/*
 * This class calculates bonus for an employee based on years of service
 */
package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read salary and years of service
        double salary = input.nextDouble();
        int years = input.nextInt();

        double bonus = 0;

        // Calculate bonus (5% if more than 5 years)
        if (years > 5) {
            bonus = salary * 0.05;
        }

        System.out.println(bonus);

        input.close();
    }
}
/*
 * This program determines whether a given year is a Leap Year or not
 * using the standard Gregorian calendar rules (introduced in 1582).
 * It helps understand nested conditional logic and multiple divisibility conditions.
 */
package CoreProgramming.ControlFlow.Level3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the year
        int year = sc.nextInt();

        if (year >= 1582) {
            // Check leap year conditions in proper order
            if (year % 400 == 0) {
                System.out.println("Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        } else {
            System.out.println("Invalid Year");
        }

        sc.close();
    }
}
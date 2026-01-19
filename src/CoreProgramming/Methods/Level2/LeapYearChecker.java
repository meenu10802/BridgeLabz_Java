/*
 * This program checks if a given year is a leap year using Gregorian calendar rules.
 * It demonstrates a method that returns boolean based on divisibility conditions.
 */
package CoreProgramming.Methods.Level2;

import java.util.Scanner;

public class LeapYearChecker {

    // Method checks if year is leap: true if divisible by 4 but not 100 unless by 400
    public boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        }
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Scanner is used to read year from user
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        // Creating object because method is non-static
        LeapYearChecker checker = new LeapYearChecker();

        // Checking and printing leap year status
        if (checker.isLeapYear(year)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        sc.close();
    }
}
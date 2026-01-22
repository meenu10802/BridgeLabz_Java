/*
 * This program determines whether given date falls in Spring season
 * (March 20 to June 20 inclusive) or not.
 * Helps understand compound conditional logic for date range checking.
 */
package CoreProgramming.Methods.Level1;

import java.util.Scanner;

public class SpringSeasonChecker {

    // Method checks and prints if date falls in spring season
    public void printSeasonStatus(int month, int day) {
        if ((month == 3 && day >= 20) || month == 4 || month == 5 ||
                (month == 6 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Its not a Spring Season");
        }
    }

    public static void main(String[] args) {
        // Scanner is used to get month and day from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month:");
        int month = sc.nextInt();

        System.out.println("Enter day:");
        int day = sc.nextInt();

        // Creating object because method is non-static
        SpringSeasonChecker checker = new SpringSeasonChecker();

        // Calling method to check and print season status
        checker.printSeasonStatus(month, day);

        sc.close();
    }
}
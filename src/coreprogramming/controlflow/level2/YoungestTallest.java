/*
 * This program determines and prints who is the youngest and who is the tallest
 * among three people (Amar, Akbar, Anthony) based on their given ages and heights.
 * It practices nested conditional logic and multiple independent comparisons
 * on different attributes of the same entities.
 */
package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read ages of three people
        int ageA = sc.nextInt();
        int ageB = sc.nextInt();
        int ageC = sc.nextInt();

        // Read heights of three people
        int hA = sc.nextInt();
        int hB = sc.nextInt();
        int hC = sc.nextInt();

        // Determine youngest person
        if (ageA < ageB && ageA < ageC) {
            System.out.println("Amar is youngest");
        } else if (ageB < ageC) {
            System.out.println("Akbar is youngest");
        } else {
            System.out.println("Anthony is youngest");
        }

        // Determine tallest person
        if (hA > hB && hA > hC) {
            System.out.println("Amar is tallest");
        } else if (hB > hC) {
            System.out.println("Akbar is tallest");
        } else {
            System.out.println("Anthony is tallest");
        }

        sc.close();
    }
}
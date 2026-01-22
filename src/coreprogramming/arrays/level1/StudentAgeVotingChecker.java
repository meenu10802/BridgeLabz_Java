// File: StudentAgeVotingChecker.java
/**
 * Class Name: StudentAgeVotingChecker
 * Purpose:    Check voting eligibility for 10 students based on age
 * Input:      10 integer ages
 * Output:     For each age: "Invalid Age" / "Can Vote" / "Cannot Vote"
 */
package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

public class StudentAgeVotingChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] ages = new int[10];

        // Read ages and check eligibility for each student
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();

            if (ages[i] < 0) {
                System.out.println("Invalid Age");
            } else if (ages[i] >= 18) {
                System.out.println("Can Vote");
            } else {
                System.out.println("Cannot Vote");
            }
        }

        sc.close();
    }
}
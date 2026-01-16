/*
 * This program checks voting eligibility for 10 students based on age.
 * It demonstrates a method that returns boolean for eligibility check.
 */
package CoreProgramming.Methods.Level2;

import java.util.Scanner;

public class StudentVotingEligibilityChecker {

    // Method checks if student can vote: true if age >=18 and >=0
    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        // Scanner is used to read ages of 10 students
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        // Creating object because method is non-static
        StudentVotingEligibilityChecker checker = new StudentVotingEligibilityChecker();

        // Reading and checking each student's age
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter age of student " + (i + 1));
            ages[i] = sc.nextInt();
            // Printing voting eligibility
            System.out.println("Student " + (i + 1) + " can vote? " + checker.canStudentVote(ages[i]));
        }

        sc.close();
    }
}
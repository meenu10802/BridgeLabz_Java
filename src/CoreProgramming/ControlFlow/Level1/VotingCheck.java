/*
 * This class checks if a person can vote based on age
 */
package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

class VotingCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read person's age
        int age = input.nextInt();

        // Check voting eligibility and print result
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        input.close();
    }
}
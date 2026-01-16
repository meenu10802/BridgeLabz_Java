/*
 * This program checks if a number is positive, negative or zero
 * and returns 1, -1 or 0 respectively.
 * It helps understand basic conditional return values from a method.
 */
package CoreProgramming.Methods.Level1;

import java.util.Scanner;

public class NumberSignChecker {

    //Returns sign of the number: 1 for positive, -1 for negative, 0 for zero
    public int checkNumberSign(int number) {
        if (number > 0) {
            return 1;
        }
        if (number < 0) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        // Scanner is used to read input from keyboard/user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        // Creating object because method is non-static
        NumberSignChecker checker = new NumberSignChecker();

        int result = checker.checkNumberSign(number);

        // Printing the sign indicator value
        System.out.println(result);

        sc.close();
    }
}
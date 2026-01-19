/*
 * This program calculates sum of first N numbers using both recursion
 * and formula, comparing two approaches.
 * It demonstrates recursive method calls vs direct formula for summation.
 */
package CoreProgramming.Methods.Level2;

import java.util.Scanner;

public class SumCalculator {

    // Recursive method adds numbers from 1 to N by calling itself
    public int calculateSumWithRecursion(int number) {
        if (number == 1) {
            return 1;
        }
        return number + calculateSumWithRecursion(number - 1);
    }

    // Method uses formula n*(n+1)/2 for sum
    public int calculateSumWithFormula(int number) {
        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {
        // Scanner is used to read N from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Enter valid number");
            sc.close();
            return;
        }

        // Creating object because methods are non-static
        SumCalculator obj = new SumCalculator();

        // Printing sum from recursive method
        System.out.println("Sum using Recursion: " + obj.calculateSumWithRecursion(number));
        // Printing sum from formula method
        System.out.println("Sum using Formula: " + obj.calculateSumWithFormula(number));

        sc.close();
    }
}
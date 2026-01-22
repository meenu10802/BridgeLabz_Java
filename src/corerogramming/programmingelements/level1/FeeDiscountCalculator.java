/*
 * This class calculates discounted fee based on user entered fee and discount percent
 */
package CoreProgramming.ProgrammingElements.Level1;

import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read fee and discount percentage from user
        double fee = sc.nextDouble();
        double discountPercent = sc.nextDouble();

        // Calculate discount amount
        double discountAmount = fee * discountPercent / 100;

        // Calculate final fee after discount
        double finalFee = fee - discountAmount;

        // Display discount and final amount
        System.out.println("The discount amount is INR " + discountAmount +
                " and final discounted fee is INR " + finalFee);

        sc.close();
    }
}
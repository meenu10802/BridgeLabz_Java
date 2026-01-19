/*
 * This class calculates total purchase amount based on unit price and quantity
 */
package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

public class PurchaseBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read unit price and number of items
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();

        // Calculate total cost
        double totalCost = unitPrice * quantity;

        // Display the bill information
        System.out.println("The total purchase price is INR " + totalCost +
                " if the quantity " + quantity +
                " and unit price is INR " + unitPrice);

        sc.close();
    }
}
/*
 * This class calculates profit and profit percentage from cost and selling price
 */
package CoreProgramming.ProgrammingElements.Level1;

public class ProfitPercentageCalculator {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        // Calculate profit amount
        int profit = sellingPrice - costPrice;

        // Calculate profit percentage
        double profitPercent = (profit / (double) costPrice) * 100;

        // Display cost, selling price and profit percentage
        System.out.println("The cost price is INR " + costPrice +
                " and selling price is INR " + sellingPrice);
        System.out.println("The Profit Percentage is " + profitPercent);
    }
}
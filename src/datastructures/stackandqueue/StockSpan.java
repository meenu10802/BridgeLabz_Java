package datastructure.stackandqueue.stackqueue;

import java.util.Scanner;
import java.util.Stack;

/*
Stock Span Problem
Problem: For each day in a stock price array, calculate the span (number of consecutive days the price was less than or equal to the current day's price).
Hint: Use a stack to keep track of indices of prices in descending order.
*/

class StockSpan {

    static void calculateSpan(int[] price) {

        int[] span = new int[price.length]; // Span array
        Stack<Integer> stack = new Stack<>(); // Stack for indices

        span[0] = 1; // First day span
        stack.push(0);

        for (int i = 1; i < price.length; i++) {

            while (!stack.isEmpty() && price[i] >= price[stack.peek()]) {
                stack.pop(); // Remove smaller prices
            }

            span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i); // Push index
        }

        System.out.println("Stock Span:");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] price = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter price for day " + (i + 1) + ": ");
            price[i] = sc.nextInt();
        }

        calculateSpan(price);
    }
}

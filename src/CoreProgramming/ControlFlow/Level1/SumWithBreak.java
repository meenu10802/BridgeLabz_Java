/*
 * This class keeps adding positive numbers until user enters zero or negative
 */
package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

class SumWithBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;

        // Keep reading numbers until non-positive value
        while (true) {
            double value = input.nextDouble();
            if (value <= 0) {
                break;
            }
            total += value;
        }

        // Print final sum
        System.out.println(total);

        input.close();
    }
}
/*
 * This class keeps adding numbers until user enters zero
 */
package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;
        double value;

        // Keep reading and adding until zero is entered
        do {
            value = input.nextDouble();
            total += value;
        } while (value != 0);

        // Display total sum
        System.out.println(total);

        input.close();
    }
}
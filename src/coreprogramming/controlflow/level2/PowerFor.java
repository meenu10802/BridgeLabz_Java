/*
 * This class calculates number raised to power using for loop
 */
package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read base number and power
        int number = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;

        if (number > 0 && power >= 0) {
            // Calculate power using for loop
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }
            System.out.println(result);
        }

        sc.close();
    }
}
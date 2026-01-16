/*
 * This class prints numbers from given counter down to 1 using for loop
 */
package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

class CountDownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read starting number for countdown
        int counter = input.nextInt();

        // Print numbers in decreasing order
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        input.close();
    }
}
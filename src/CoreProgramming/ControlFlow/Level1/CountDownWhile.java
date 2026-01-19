/*
 * This class prints numbers from given counter down to 1 using while loop
 */
package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

class CountDownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read starting number
        int counter = input.nextInt();

        // Print countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        input.close();
    }
}
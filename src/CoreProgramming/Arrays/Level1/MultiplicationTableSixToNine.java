// File: MultiplicationTableSixToNine.java
/**
 * Class Name: MultiplicationTableSixToNine
 * Purpose:    Print multiplication table only for multipliers 6,7,8,9
 * Input:      One integer number
 * Output:     4 lines in format: n * i = result (i=6 to 9)
 */
package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

public class MultiplicationTableSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the base number
        int number = sc.nextInt();

        // Print multiplication only for 6 to 9
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + "*" + i + "=" + result);
        }

        sc.close();
    }
}
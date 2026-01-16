/**
 * Class Name: MultiplicationTablePrinter
 * Purpose:    Generate and print multiplication table (1 to 10) 
 *             for a given number
 * Input:      One integer number
 * Output:     10 lines in format: n * i = result
 */
package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

public class MultiplicationTablePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number for which we want multiplication table
        int number = sc.nextInt();

        // Create array to store table values
        int[] table = new int[10];

        // Calculate multiplication values from 1 to 10
        for (int i = 1; i <= 10; i++) {
            table[i-1] = number * i;
        }

        // Print formatted multiplication table
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i+1) + " = " + table[i]);
        }

        sc.close();
    }
}
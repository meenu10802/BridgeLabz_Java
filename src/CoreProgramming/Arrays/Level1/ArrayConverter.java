/**
 * Class Name:ArrayConverter
 * Purpose:    Convert 2D matrix to 1D array using row-major order
 * Input:      Number of rows, number of columns, then matrix elements
 * Output:     All elements printed as single line (1D) + original matrix
 */
package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

public class ArrayConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get dimensions of 2D array from user
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");
        int cols = sc.nextInt();

        // Create 2D array
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter values");
        // Read elements into 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create 1D array with total size = rows * columns
        int[] oneD = new int[rows * cols];
        int index = 0;

        // Copy 2D elements to 1D array (row by row)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneD[index++] = matrix[i][j];
            }
        }

        // Display converted 1D array
        System.out.println("1D Array:");
        for (int num : oneD) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Display original 2D matrix for verification
        System.out.println("Original 2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
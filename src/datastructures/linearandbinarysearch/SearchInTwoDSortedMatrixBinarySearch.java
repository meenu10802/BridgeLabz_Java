package datastructure.linearandbinarysearch;

import java.util.Scanner;

public class SearchInTwoDSortedMatrixBinarySearch {

    /*
     Binary Search Problem 3: Search for a Target Value in a 2D Sorted Matrix
     Problem:
     You are given a 2D matrix where each row is sorted in ascending order, and the first element
     of each row is greater than the last element of the previous row.
     Write a program that performs Binary Search to find a target value in the matrix.
     Approach:
     Treat the matrix as a 1D array.
     Perform binary search and map index to row and column.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Loop to read matrix elements
        for (int i = 0; i < rows; i++) { // for-loop iterates rows
            for (int j = 0; j < cols; j++) { // for-loop iterates columns
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Ask user for target
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int left = 0, right = rows * cols - 1;
        boolean found = false;

        // Binary search on virtual 1D array
        while (left <= right) { // while-loop searches target
            int mid = (left + right) / 2;
            int r = mid / cols;
            int c = mid % cols;

            if (matrix[r][c] == target) {
                found = true;
                break;
            } else if (matrix[r][c] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Target found: " + found);

        sc.close();
    }
}

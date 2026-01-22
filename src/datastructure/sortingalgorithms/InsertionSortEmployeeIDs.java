package datastructure.sortingalgorithms;

import java.util.Scanner;

public class InsertionSortEmployeeIDs {

    /*
    2. Insertion Sort - Sort Employee IDs
    Problem Statement:
    A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs in ascending order.
    Hint:
    Divide the array into sorted and unsorted parts.
    Pick an element from the unsorted part and insert it into its correct position in the sorted part.
    Repeat for all elements.
    */

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Loop starts from second element assuming first is already sorted
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // Element to be placed correctly
            int j = i - 1;

            // Shift elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] empIds = new int[n];

        // Loop to take employee ID input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Employee ID " + (i + 1) + ": ");
            empIds[i] = sc.nextInt();
        }

        insertionSort(empIds);

        System.out.println("Sorted Employee IDs (Ascending Order):");

        // Loop to print sorted employee IDs
        for (int i = 0; i < n; i++) {
            System.out.print(empIds[i] + " ");
        }

        sc.close();
    }
}

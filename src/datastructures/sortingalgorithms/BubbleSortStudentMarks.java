package datastructure.sortingalgorithms;

import java.util.Scanner;

public class BubbleSortStudentMarks {

    /*
    1. Bubble Sort - Sort Student Marks
    Problem Statement:
    A school maintains student marks in an array. Implement Bubble Sort to sort the student marks in ascending order.
    Hint:
    Traverse through the array multiple times.
    Compare adjacent elements and swap if needed.
    Repeat the process until no swaps are required.
    */

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop runs n-1 times to ensure complete sorting
        for (int i = 0; i < n - 1; i++) {

            // Inner loop compares adjacent elements in each pass
            for (int j = 0; j < n - i - 1; j++) {

                // If current element is greater than next, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];      // Store current element
                    arr[j] = arr[j + 1];    // Move next element left
                    arr[j + 1] = temp;      // Place stored element right
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Loop to take marks input from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        bubbleSort(marks);

        System.out.println("Sorted student marks (Ascending Order):");

        // Loop to display sorted marks
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }

        sc.close();
    }
}

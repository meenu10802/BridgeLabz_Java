package datastructure.sortingalgorithms;

import java.util.Scanner;

public class SelectionSortExamScores {

    /*
    5. Selection Sort - Sort Exam Scores
    Problem Statement:
    A university needs to sort students’ exam scores in ascending order. Implement Selection Sort to achieve this.
    Hint:
    Find the minimum element in the array.
    Swap it with the first unsorted element.
    Repeat the process for the remaining elements.
    */

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Outer loop moves boundary of unsorted part
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i; // Assume current index has minimum value

            // Inner loop finds the minimum element in remaining unsorted array
            for (int j = i + 1; j < n; j++) {

                // If a smaller value is found, update minIndex
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        // Loop to take exam score input from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter exam score of student " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }

        selectionSort(scores);

        System.out.println("Sorted Exam Scores (Ascending Order):");

        // Loop to display sorted exam scores
        for (int i = 0; i < n; i++) {
            System.out.print(scores[i] + " ");
        }

        sc.close();
    }
}

package datastructure.linearandbinarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class FirstMissingPositiveAndBinarySearch {

    /*
     Challenge Problem (for both Linear and Binary Search)
     Problem:
     You are given a list of integers. Write a program that uses Linear Search to find the first
     missing positive integer in the list and Binary Search to find the index of a given target number.
     Approach:
     Linear Search:
     Mark visited positive numbers and find missing one.
     Binary Search:
     Sort array and search target using binary search.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Loop to read array elements
        for (int i = 0; i < n; i++) { // for-loop reads elements
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        boolean[] present = new boolean[n + 1];

        // Loop to mark positive numbers
        for (int i = 0; i < n; i++) { // for-loop marks visited positives
            if (arr[i] > 0 && arr[i] <= n) {
                present[arr[i]] = true;
            }
        }

        int missing = -1;

        // Loop to find first missing positive
        for (int i = 1; i <= n; i++) { // for-loop checks missing number
            if (!present[i]) {
                missing = i;
                break;
            }
        }

        System.out.println("First Missing Positive Integer: " + missing);

        // Ask user for binary search target
        System.out.print("Enter target for binary search: ");
        int target = sc.nextInt();

        Arrays.sort(arr);

        int left = 0, right = n - 1, index = -1;

        // Binary search for target
        while (left <= right) { // while-loop performs binary search
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Binary Search Index: " + index);

        sc.close();
    }
}

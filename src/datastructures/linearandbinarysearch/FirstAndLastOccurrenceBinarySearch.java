package datastructure.linearandbinarysearch;

import java.util.Scanner;

public class FirstAndLastOccurrenceBinarySearch {

    /*
     Binary Search Problem 4: Find the First and Last Occurrence of an Element in a Sorted Array
     Problem:
     Given a sorted array and a target element, write a program that uses Binary Search to find
     the first and last occurrence of the target element.
     Approach:
     Use binary search twice: once for first occurrence and once for last occurrence.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Loop to read array elements
        for (int i = 0; i < n; i++) { // for-loop reads each element
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Ask user for target
        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int first = -1, last = -1;
        int left = 0, right = n - 1;

        // Binary search for first occurrence
        while (left <= right) { // while-loop finds first index
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = 0;
        right = n - 1;

        // Binary search for last occurrence
        while (left <= right) { // while-loop finds last index
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("First Occurrence Index: " + first);
        System.out.println("Last Occurrence Index: " + last);

        sc.close();
    }
}

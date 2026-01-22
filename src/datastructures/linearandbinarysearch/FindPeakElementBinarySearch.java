package datastructure.linearandbinarysearch;

import java.util.Scanner;

public class FindPeakElementBinarySearch {

    /*
     Binary Search Problem 2: Find the Peak Element in an Array
     Problem:
     A peak element is an element that is greater than its neighbors. Write a program that performs
     Binary Search to find a peak element in an array. If there are multiple peak elements, return any one of them.
     Approach:
     Initialize left as 0 and right as n - 1.
     Perform a binary search:
     Find the middle element mid = (left + right) / 2.
     If arr[mid] > arr[mid - 1] and arr[mid] > arr[mid + 1], arr[mid] is a peak element.
     If arr[mid] < arr[mid - 1], search left half.
     If arr[mid] < arr[mid + 1], search right half.
     Continue until a peak element is found.
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

        int left = 0, right = n - 1;

        // Binary search to find peak element
        while (left < right) { // while-loop finds peak using binary logic
            int mid = (left + right) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        System.out.println("Peak element: " + arr[left]);
        System.out.println("Peak index: " + left);

        sc.close();
    }
}

package datastructure.linearandbinarysearch;

import java.util.Scanner;

public class FindRotationPointBinarySearch {

    /*
     Binary Search Problem 1: Find the Rotation Point in a Rotated Sorted Array
     Problem:
     You are given a rotated sorted array. Write a program that performs Binary Search to find the index
     of the smallest element in the array (the rotation point).
     Approach:
     Initialize left as 0 and right as n - 1.
     Perform a binary search:
     Find the middle element mid = (left + right) / 2.
     If arr[mid] > arr[right], then the smallest element is in the right half, so update left = mid + 1.
     If arr[mid] < arr[right], the smallest element is in the left half, so update right = mid.
     Continue until left equals right, and then return arr[left] (the rotation point).
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

        // Binary search to find rotation point
        while (left < right) { // while-loop narrows search space
            int mid = (left + right) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        System.out.println("Rotation point index: " + left);
        System.out.println("Smallest element: " + arr[left]);

        sc.close();
    }
}

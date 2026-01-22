package datastructure.linearandbinarysearch;

import java.util.Scanner;

public class FirstNegativeNumberLinearSearch {

    /*
     Linear Search Problem 1: Search for the First Negative Number
     Problem:
     You are given an integer array. Write a program that performs Linear Search to find the first negative number in the array.
     If a negative number is found, return its index. If no negative number is found, return -1.
     Approach:
     Iterate through the array from the start.
     Check if the current element is negative.
     If a negative number is found, return its index.
     If the loop completes without finding a negative number, return -1.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Loop to read array elements
        for (int i = 0; i < n; i++) { // for-loop reads each array element
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        int index = -1;

        // Loop to find first negative number
        for (int i = 0; i < n; i++) { // for-loop checks each element
            if (arr[i] < 0) {
                index = i;
                break;
            }
        }

        System.out.println("First Negative Number Index: " + index);

        sc.close();
    }
}

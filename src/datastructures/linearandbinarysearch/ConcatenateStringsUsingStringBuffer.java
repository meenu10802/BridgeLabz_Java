package datastructure.linearandbinarysearch;

import java.util.Scanner;

public class ConcatenateStringsUsingStringBuffer {

    /*
     StringBuffer Problem 1: Concatenate Strings Efficiently Using StringBuffer
     Problem:
     You are given an array of strings. Write a program that uses StringBuffer to concatenate all the strings in the array efficiently.
     Approach:
     Create a new StringBuffer object.
     Iterate through each string in the array and append it to the StringBuffer.
     Return the concatenated string after the loop finishes.
     Using StringBuffer ensures efficient string concatenation due to its mutable nature.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for number of strings
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // Create string array
        String[] arr = new String[n];

        // Loop to take string inputs from user
        for (int i = 0; i < n; i++) { // for-loop to read each string from user
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        // Create StringBuffer object
        StringBuffer sb = new StringBuffer();

        // Loop to append each string to StringBuffer
        for (int i = 0; i < n; i++) { // for-loop to concatenate strings efficiently
            sb.append(arr[i]);
        }

        // Print concatenated result
        System.out.println("Concatenated String: " + sb.toString());

        sc.close();
    }
}

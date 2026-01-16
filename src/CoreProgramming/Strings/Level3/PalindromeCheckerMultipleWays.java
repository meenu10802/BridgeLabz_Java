package CoreProgramming.Strings.Level3;

import java.util.Scanner;

/*
 * This program checks if a string is palindrome using three different methods:
 * 1. Two-pointer comparison
 * 2. Recursive comparison
 * 3. Character array reversal
 * Demonstrates multiple approaches to palindrome checking.
 */
public class PalindromeCheckerMultipleWays {

    // Method 1: Two-pointer approach
    public static boolean isPalindromeTwoPointer(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Recursive approach
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    // Method 3: Using character array reversal
    public static boolean isPalindromeUsingReverse(String str) {
        char[] original = str.toCharArray();
        char[] reversed = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Scanner is used to read string from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Method 1 - Two Pointer
        boolean result1 = isPalindromeTwoPointer(text);

        // Method 2 - Recursive
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);

        // Method 3 - Reverse Array
        boolean result3 = isPalindromeUsingReverse(text);

        // Displaying results
        System.out.println("Two-Pointer Method: " + (result1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Recursive Method: " + (result2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Reverse Array Method: " + (result3 ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}
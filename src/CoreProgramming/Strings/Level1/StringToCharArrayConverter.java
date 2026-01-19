/*
 * This program converts string to char array using both toCharArray() and custom loop.
 * It compares the arrays to verify, demonstrating string to array conversion.
 */
package CoreProgramming.Strings.Level1;

import java.util.Scanner;

public class StringToCharArrayConverter {

    // Method creates char array using charAt loop
    public static char[] convertUsingCharAt(String str) {
        char[] array = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i);
        }
        return array;
    }

    // Method compares two char arrays for equality
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Scanner is used to read string from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.next();

        // Using built-in toCharArray
        char[] builtInArray = str.toCharArray();

        // Using custom charAt method
        char[] customArray = convertUsingCharAt(str);

        // Printing match status
        System.out.println("Both Array Matches:" + compareArrays(builtInArray, customArray));

        sc.close();
    }
}
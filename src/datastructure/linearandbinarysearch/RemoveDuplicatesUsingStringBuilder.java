package datastructure.linearandbinarysearch;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesUsingStringBuilder {

    /*
     StringBuilder Problem 2: Remove Duplicates from a String Using StringBuilder
     Problem:
     Write a program that uses StringBuilder to remove all duplicate characters from a given string while maintaining the original order.
     Approach:
     Initialize an empty StringBuilder and a HashSet to keep track of characters.
     Iterate over each character in the string:
     If the character is not in the HashSet, append it to the StringBuilder and add it to the HashSet.
     Return the StringBuilder as a string without duplicates.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // StringBuilder to store result without duplicates
        StringBuilder result = new StringBuilder();

        // HashSet to track already seen characters
        HashSet<Character> seen = new HashSet<>();

        // Loop through each character in the input string one by one
        for (int i = 0; i < input.length(); i++) { // for-loop to access each character by index

            char ch = input.charAt(i);

            // If character is not already seen, add it
            if (!seen.contains(ch)) {
                result.append(ch);
                seen.add(ch);
            }
        }

        // Print final string without duplicates
        System.out.println("String without duplicates: " + result.toString());

        sc.close();
    }
}

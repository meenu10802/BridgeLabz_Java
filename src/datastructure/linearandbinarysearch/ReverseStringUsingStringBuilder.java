package datastructure.linearandbinarysearch;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {

    /*
     StringBuilder Problem 1: Reverse a String Using StringBuilder
     Problem:
     Write a program that uses StringBuilder to reverse a given string. For example, if the input is "hello", the output should be "olleh".
     Approach:
     Create a new StringBuilder object.
     Append the string to the StringBuilder.
     Use the reverse() method of StringBuilder to reverse the string.
     Convert the StringBuilder back to a string and return it.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Append the input string to StringBuilder
        sb.append(input);

        // Reverse the string using reverse() method
        sb.reverse();

        // Convert StringBuilder to String and print result
        System.out.println("Reversed String: " + sb.toString());

        sc.close();
    }
}

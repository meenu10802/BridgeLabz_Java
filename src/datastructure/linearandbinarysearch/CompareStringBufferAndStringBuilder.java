package datastructure.linearandbinarysearch;

import java.util.Scanner;

public class CompareStringBufferAndStringBuilder {

    /*
     StringBuffer Problem 2: Compare StringBuffer with StringBuilder for String Concatenation
     Problem:
     Write a program that compares the performance of StringBuffer and StringBuilder for concatenating strings. For large datasets (e.g., concatenating 1 million strings), compare the execution time of both classes.
     Approach:
     Initialize two StringBuffer and StringBuilder objects.
     Perform string concatenation in both objects, appending 1 million strings (e.g., "hello").
     Measure the time taken to complete the concatenation using System.nanoTime() for both StringBuffer and StringBuilder.
     Output the time taken by both classes for comparison.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for number of iterations
        System.out.print("Enter number of times to append (e.g., 1000000): ");
        int count = sc.nextInt();

        // -------- StringBuilder Test --------
        StringBuilder sb = new StringBuilder();
        long startBuilder = System.nanoTime();

        // Loop to append string using StringBuilder
        for (int i = 0; i < count; i++) { // for-loop to append string multiple times
            sb.append("hello");
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // -------- StringBuffer Test --------
        StringBuffer buffer = new StringBuffer();
        long startBuffer = System.nanoTime();

        // Loop to append string using StringBuffer
        for (int i = 0; i < count; i++) { // for-loop to append string multiple times
            buffer.append("hello");
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        // Print results
        System.out.println("StringBuilder Time (nanoseconds): " + builderTime);
        System.out.println("StringBuffer Time (nanoseconds): " + bufferTime);

        sc.close();
    }
}

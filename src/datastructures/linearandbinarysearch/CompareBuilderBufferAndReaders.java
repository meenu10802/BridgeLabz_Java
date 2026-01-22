package datastructure.linearandbinarysearch;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CompareBuilderBufferAndReaders {

    /*
     Challenge Problem: Compare StringBuilder, StringBuffer, FileReader, and InputStreamReader
     Problem:
     Write a program that:
     Uses StringBuilder and StringBuffer to concatenate a list of strings 1,000,000 times.
     Uses FileReader and InputStreamReader to read a large file (e.g., 100MB) and print the number of words in the file.
     Approach:
     StringBuilder and StringBuffer:
     Create a list of strings (e.g., "hello").
     Concatenate the strings 1,000,000 times using both StringBuilder and StringBuffer.
     Measure and compare the time taken for each.
     FileReader and InputStreamReader:
     Read a large text file (100MB) using FileReader and InputStreamReader.
     Count the number of words by splitting the text on whitespace characters.
     Print the word count and compare the time taken for reading the file.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for number of concatenations
        System.out.print("Enter number of times to concatenate: ");
        int count = sc.nextInt();
        sc.nextLine();

        // StringBuilder Test
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        // Loop to concatenate string using StringBuilder
        for (int i = 0; i < count; i++) { // for-loop appends string repeatedly
            sb.append("hello");
        }

        long endBuilder = System.nanoTime();
        System.out.println("StringBuilder Time (nanoseconds): " + (endBuilder - startBuilder));

        // StringBuffer Test
        long startBuffer = System.nanoTime();
        StringBuffer buffer = new StringBuffer();

        // Loop to concatenate string using StringBuffer
        for (int i = 0; i < count; i++) { // for-loop appends string repeatedly
            buffer.append("hello");
        }

        long endBuffer = System.nanoTime();
        System.out.println("StringBuffer Time (nanoseconds): " + (endBuffer - startBuffer));

        // Ask user for file path
        System.out.print("Enter large file path: ");
        String filePath = sc.nextLine();

        // FileReader Test
        try {
            long startFR = System.nanoTime();
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            int wordCountFR = 0;
            String line;

            // Loop to read file line by line using FileReader
            while ((line = br.readLine()) != null) { // while-loop reads each line
                String[] words = line.split("\\s+");
                wordCountFR += words.length;
            }

            br.close();
            long endFR = System.nanoTime();

            System.out.println("FileReader Word Count: " + wordCountFR);
            System.out.println("FileReader Time (nanoseconds): " + (endFR - startFR));

        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }

        //  InputStreamReader Test
        try {
            long startISR = System.nanoTime();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));

            int wordCountISR = 0;
            String line;

            // Loop to read file line by line using InputStreamReader
            while ((line = br.readLine()) != null) { // while-loop reads converted characters
                String[] words = line.split("\\s+");
                wordCountISR += words.length;
            }

            br.close();
            long endISR = System.nanoTime();

            System.out.println("InputStreamReader Word Count: " + wordCountISR);
            System.out.println("InputStreamReader Time (nanoseconds): " + (endISR - startISR));

        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }

        sc.close();
    }
}

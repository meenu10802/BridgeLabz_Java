package datastructure.linearandbinarysearch;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ReadFileUsingInputStreamReader {

    /*
     InputStreamReader Problem 1: Convert Byte Stream to Character Stream Using InputStreamReader
     Problem:
     Write a program that uses InputStreamReader to read binary data from a file and print it as characters. The file contains data encoded in a specific charset (e.g., UTF-8).
     Approach:
     Create a FileInputStream object to read the binary data from the file.
     Wrap the FileInputStream in an InputStreamReader to convert the byte stream into a character stream.
     Use a BufferedReader to read characters efficiently from the InputStreamReader.
     Read the file line by line and print the characters to the console.
     Handle any encoding exceptions as needed.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for file path
        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        try {
            // Create FileInputStream
            FileInputStream fis = new FileInputStream(filePath);

            // Convert byte stream to character stream using UTF-8
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

            // Wrap InputStreamReader with BufferedReader
            BufferedReader br = new BufferedReader(isr);

            String line;

            // Loop to read file line by line
            while ((line = br.readLine()) != null) { // while-loop reads converted characters
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}

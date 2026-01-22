package datastructure.linearandbinarysearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileLineByLineUsingFileReader {

    /*
     FileReader Problem 1: Read a File Line by Line Using FileReader
     Problem:
     Write a program that uses FileReader to read a text file line by line and print each line to the console.
     Approach:
     Create a FileReader object to read from the file.
     Wrap the FileReader in a BufferedReader to read lines efficiently.
     Use a loop to read each line using the readLine() method and print it to the console.
     Close the file after reading all the lines.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user to enter file path
        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        try {
            // Create FileReader to read file
            FileReader fr = new FileReader(filePath);

            // Wrap FileReader with BufferedReader
            BufferedReader br = new BufferedReader(fr);

            String line;

            // Loop to read file line by line until end of file
            while ((line = br.readLine()) != null) { // while-loop reads each line one by one
                System.out.println(line);
            }

            // Close BufferedReader
            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}

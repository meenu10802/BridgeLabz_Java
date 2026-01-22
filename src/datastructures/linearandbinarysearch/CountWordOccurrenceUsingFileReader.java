package datastructure.linearandbinarysearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWordOccurrenceUsingFileReader {

    /*
     FileReader Problem 2: Count the Occurrence of a Word in a File Using FileReader
     Problem:
     Write a program that uses FileReader and BufferedReader to read a file and count how many times a specific word appears in the file.
     Approach:
     Create a FileReader to read from the file and wrap it in a BufferedReader.
     Initialize a counter variable to keep track of word occurrences.
     For each line in the file, split it into words and check if the target word exists.
     Increment the counter each time the word is found.
     Print the final count.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for file path
        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        // Ask user for target word
        System.out.print("Enter word to count: ");
        String targetWord = sc.nextLine();

        int count = 0;

        try {
            // Create FileReader and BufferedReader
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            // Loop to read each line from the file
            while ((line = br.readLine()) != null) { // while-loop reads file line by line

                // Split line into words using space
                String[] words = line.split("\\s+");

                // Loop through each word in the line
                for (int i = 0; i < words.length; i++) { // for-loop checks each word
                    if (words[i].equals(targetWord)) {
                        count++;
                    }
                }
            }

            br.close();

            // Print final count
            System.out.println("Word '" + targetWord + "' occurred " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}

package datastructure.linearandbinarysearch;

import java.io.*;
import java.util.Scanner;

public class ReadConsoleAndWriteToFileUsingInputStreamReader {

    /*
     InputStreamReader Problem 2: Read User Input and Write to File Using InputStreamReader
     Problem:
     Write a program that uses InputStreamReader to read user input from the console and write the input to a file. Each input should be written as a new line in the file.
     Approach:
     Create an InputStreamReader to read from System.in (the console).
     Wrap the InputStreamReader in a BufferedReader for efficient reading.
     Create a FileWriter to write to the file.
     Read user input using readLine() and write the input to the file.
     Repeat the process until the user enters "exit" to stop inputting.
     Close the file after the input is finished.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for output file path
        System.out.print("Enter file path to write data: ");
        String filePath = sc.nextLine();

        try {
            // Read input from console
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Write output to file
            FileWriter fw = new FileWriter(filePath, true);

            String input;

            System.out.println("Enter text (type 'exit' to stop):");

            // Loop to read user input until "exit"
            while (true) { // infinite loop until user breaks
                input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                fw.write(input + System.lineSeparator());
            }

            fw.close();

            System.out.println("Data successfully written to file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

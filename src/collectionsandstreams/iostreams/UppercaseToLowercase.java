package collectionsandstreams.ioStreams;

import java.io.*;

/**
 * Reads a text file and writes its contents to another file,
 * converting all uppercase letters to lowercase using FileReader/FileWriter and BufferedReader/BufferedWriter.
 */
public class UppercaseToLowercase {
    public static void main(String[] args) {
        String inputPath = "src/collecctionsandstreams/ioStreams/sample_uppercase.txt";
        String outputPath = "src/collecctionsandstreams/ioStreams/sample_lowercase.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            String line;
            // Read line by line, convert to lowercase, and write
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }
            writer.flush();
            System.out.println("Converted file written to " + outputPath);
        }
        // Handle encoding or I/O errors
        catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

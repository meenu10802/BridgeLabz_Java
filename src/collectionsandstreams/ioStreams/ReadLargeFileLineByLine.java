package collectionsandstreams.ioStreams;

import java.io.*;

/**
 * Reads a large text file line by line using BufferedReader and prints only
 * lines containing the word "error" (case insensitive).
 */
public class ReadLargeFileLineByLine {
    public static void main(String[] args) {
        String filePath = "src/collecctionsandstreams/ioStreams/sample_large.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            long lineNum = 0;
            // Read one line at a time to avoid loading entire file into memory
            while ((line = reader.readLine()) != null) {
                lineNum++;
                // Print only lines that contain "error" (case insensitive)
                if (line.toLowerCase().contains("error")) {
                    System.out.println(lineNum + ": " + line);
                }
            }
        }
        // Handle file not found or read errors
        catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

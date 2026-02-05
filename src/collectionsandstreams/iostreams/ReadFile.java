package collectionsandstreams.ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ReadFile copies the contents of sample.txt to output.txt using byte streams.
 * It uses try-with-resources so input and output streams are closed automatically.
 */
public class ReadFile {
    public static void main(String[] args) {
        // Open input and output streams; try-with-resources closes them automatically
        try (FileInputStream input = new FileInputStream("src/collecctionsandstreams/ioStreams/sample.txt");
             FileOutputStream output = new FileOutputStream("src/collecctionsandstreams/ioStreams/output.txt")) {
            int byteData;
            // Read one byte at a time and write it to the output until end of file (-1)
            while ((byteData = input.read()) != -1) {
                output.write(byteData);
            }
        }
        // Handle any I/O errors during read or write
        catch (IOException e) {
            System.out.println("Error occured " + e);
        }
    }
}

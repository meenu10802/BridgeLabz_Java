package collectionsandstreams.ioStreams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Asks the user for name, age, and favorite programming language,
 * then saves this information to a file using BufferedReader and FileWriter.
 */
public class ConsoleInputToFile {
    public static void main(String[] args) {
        String outputPath = "src/collecctionsandstreams/ioStreams/user_info.txt";

        // Use BufferedReader for console input (wraps System.in)
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(outputPath)) {

            // Prompt and read name
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            // Prompt and read age
            System.out.print("Enter your age: ");
            String age = reader.readLine();

            // Prompt and read favorite programming language
            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Build content and write to file
            String content = "Name: " + name + "\nAge: " + age + "\nFavorite language: " + language + "\n";
            writer.write(content);
            writer.flush();

            System.out.println("Data saved to " + outputPath);
        }
        // Handle I/O or null input
        catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

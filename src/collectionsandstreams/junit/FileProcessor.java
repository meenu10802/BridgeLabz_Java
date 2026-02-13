package collectionsandstreams.junit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Basic JUnit Test - Problem 8: Testing File Handling Methods
 *
 * This class provides methods to write content to a file and read content
 * from a file. Used to demonstrate testing file I/O operations and
 * IOException handling in JUnit.
 */
public class FileProcessor {

    // Writes the given content to the specified file
    public void writeToFile(String filename, String content) throws IOException {
        Path path = Paths.get(filename);
        Files.write(path, content.getBytes());
    }

    // Reads and returns content from the specified file; throws IOException if file does not exist
    public String readFromFile(String filename) throws IOException {
        Path path = Paths.get(filename);
        return new String(Files.readAllBytes(path));
    }

    // Checks if the specified file exists
    public boolean fileExists(String filename) {
        return Files.exists(Paths.get(filename));
    }
}

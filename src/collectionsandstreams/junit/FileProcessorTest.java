package collectionsandstreams.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test cases for FileProcessor class.
 *
 * Verifies content is written and read correctly, file exists after writing,
 * and IOException is thrown when reading non-existent file.
 */
class FileProcessorTest {

    private FileProcessor fileProcessor;
    private static final String TEST_FILE = "test_file_processor.txt";

    // Initialize FileProcessor before each test
    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor();
    }

    // Clean up test file after each test to avoid affecting other tests
    @AfterEach
    void tearDown() throws IOException {
        Path path = Paths.get(TEST_FILE);
        if (Files.exists(path)) {
            Files.delete(path);
        }
    }

    // Test that content is written and read correctly
    @Test
    @DisplayName("Should write and read content correctly")
    void testWriteAndReadContent() throws IOException {
        String content = "Hello, JUnit File Test!";
        fileProcessor.writeToFile(TEST_FILE, content);
        String readContent = fileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent);
    }

    // Test that file exists after writing
    @Test
    @DisplayName("Should create file that exists after writing")
    void testFileExistsAfterWriting() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "test content");
        assertTrue(fileProcessor.fileExists(TEST_FILE));
    }

    // Test that IOException is thrown when reading non-existent file
    @Test
    @DisplayName("Should throw IOException when reading non-existent file")
    void testReadNonExistentFileThrowsIOException() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("non_existent_file_xyz.txt"));
    }

    // Test write with empty content
    @Test
    @DisplayName("Should handle empty content")
    void testWriteEmptyContent() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "");
        assertEquals("", fileProcessor.readFromFile(TEST_FILE));
    }
}

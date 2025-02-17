package junittest.basicjunittest.fileprocessor;

import junit.basicjunittest.fileprocessor.FileProcessor;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;
import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    private FileProcessor fileProcessor;
    private String filename = "testfile.txt";

    @BeforeEach
    void setup() {
        fileProcessor = new FileProcessor();
    }

    // Test to check if the content is written and read correctly
    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Test content for file.";

        // Write content to file
        fileProcessor.writeToFile(filename, content);

        // Read content from file
        String readContent = fileProcessor.readFromFile(filename);

        // Assert that the content written is the same as the content read
        assertEquals(content, readContent);
    }

    // Test to check if the file exists after writing
    @Test
    void testFileExistsAfterWriting() throws IOException {
        String content = "Content for file existence check.";

        // Write content to file
        fileProcessor.writeToFile(filename, content);

        // Check if the file exists
        assertTrue(Files.exists(Paths.get(filename)), "File should exist after writing.");
    }

    // Test to handle IOException when file does not exist
    @Test
    void testIOExceptionForNonExistentFile() {
        String nonExistentFile = "nonexistentfile.txt";

        // Try reading a non-existent file
        assertThrows(IOException.class, () -> {
            fileProcessor.readFromFile(nonExistentFile);
        }, "IOException should be thrown when file does not exist.");
    }

    // Main method to manually test the file handling methods
    public static void main(String[] args) {
        FileProcessorTest test = new FileProcessorTest();
        test.setup();

        try {
            // Run tests manually
            test.testWriteAndReadFile();
            test.testFileExistsAfterWriting();
            test.testIOExceptionForNonExistentFile();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

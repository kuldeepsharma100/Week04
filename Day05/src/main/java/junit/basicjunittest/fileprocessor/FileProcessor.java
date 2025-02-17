package junit.basicjunittest.fileprocessor;

import java.io.*;
import java.nio.file.*;

public class FileProcessor {

    // Method to write content to a file
    public void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filename))) {
            writer.write(content);
        }
    }

    // Method to read content from a file
    public String readFromFile(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }

    // Main method to manually test the methods
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor();
        String filename = "testfile.txt";
        String content = "Hello, World!";

        try {
            fileProcessor.writeToFile(filename, content);
            System.out.println("Content written to file.");
            String readContent = fileProcessor.readFromFile(filename);
            System.out.println("Content read from file: " + readContent);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

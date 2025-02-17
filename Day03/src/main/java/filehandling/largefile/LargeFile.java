package filehandling.largefile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeFile {
    public static void readErrorLines(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) { // Case-insensitive check
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}

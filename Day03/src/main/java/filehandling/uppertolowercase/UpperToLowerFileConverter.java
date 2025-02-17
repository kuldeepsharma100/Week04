package filehandling.uppertolowercase;

import java.io.*;

public class UpperToLowerFileConverter {
    public static void convertFileToLowercase(String source, String destination) {
        try (BufferedReader br = new BufferedReader(new FileReader(source));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destination))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toLowerCase()); // Convert to lowercase
                bw.newLine(); // Write new line
            }

            System.out.println("File conversion completed successfully!");

        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }

}

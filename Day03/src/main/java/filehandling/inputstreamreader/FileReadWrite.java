package filehandling.inputstreamreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {
    public static void fileReadWrite(String sourceFile, String destinationFile){


        // Reading and writing files
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData); // Write data to destination file
            }

            System.out.println("File copied successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Source file '" + sourceFile + "' not found.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred - " + e.getMessage());
        }

    }
}

package exceptionhandling.autoclosingresources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWithResources {
    public static void readFirstLine(String filePath){
        File file = new File(filePath);

        try  {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine();
            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("File is empty.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

    }
}

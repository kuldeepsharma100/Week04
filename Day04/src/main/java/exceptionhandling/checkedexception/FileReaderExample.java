package exceptionhandling.checkedexception;

import java.io.*;

public class FileReaderExample {

    public static void readFile(String filePath){
        File file = new File(filePath);

        try  {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {

            System.out.println("File not found");
        } catch (
                IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }

}

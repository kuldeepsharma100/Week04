package filehandling.bytearraystream;

import java.io.*;

public class ImageByteArrayStream {
    public static byte[] convertImageToByteArray(String imagePath) {
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096]; // 4KB buffer size
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        } catch (IOException e) {
            System.out.println("Error reading image file: " + e.getMessage());
            return null;
        }
    }

    // Write byte array back to an image file
    public static boolean writeByteArrayToImage(byte[] imageData, String outputPath) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[4096]; // 4KB buffer size
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            return true;
        } catch (IOException e) {
            System.out.println("Error writing image file: " + e.getMessage());
            return false;
        }

    }}

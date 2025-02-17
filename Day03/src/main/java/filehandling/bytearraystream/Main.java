package filehandling.bytearraystream;

public class Main {
    public static void main(String[] args) {

        String sourceImage = "input.jpg";
        String outputImage = "output.jpg";

        // Convert image to byte array
        byte[] imageBytes = ImageByteArrayStream.convertImageToByteArray(sourceImage);
        if (imageBytes != null) {
            System.out.println("Image successfully converted to byte array. Size: " + imageBytes.length + " bytes");

            // Write byte array back to a new image file
            if (ImageByteArrayStream.writeByteArrayToImage(imageBytes, outputImage)) {
                System.out.println("Image successfully written to " + outputImage);
            } else {
                System.out.println("Failed to write image.");
            }
        } else {
            System.out.println("Image conversion failed.");
        }
    }

}

package filehandling.bufferedstream;

public class BufferedFileMain {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationBuffered = "destination.txt";
        String destinationUnbuffered = "destination1.txt";

        // Copy using Buffered Streams
        long timeBuffered = BufferedFileCopy.copyFileBuffered(sourceFile, destinationBuffered);
        System.out.println("Buffered Stream Copy Time: " + timeBuffered + " ns");

        // Copy using Unbuffered Streams
        long timeUnbuffered = BufferedFileCopy.copyFileUnbuffered(sourceFile, destinationUnbuffered);
        System.out.println("Unbuffered Stream Copy Time: " + timeUnbuffered + " ns");

        // Compare performance
        System.out.println("Buffered streams were " + ((double) timeUnbuffered / timeBuffered) + " times faster than unbuffered.");

    }
}

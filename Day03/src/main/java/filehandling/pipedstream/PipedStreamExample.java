package filehandling.pipedstream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamExample {
    public static void main(String[] args) {
        try {
            // Create piped streams
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            // Create and start writer and reader threads
            Thread writerThread = new Thread(new Writer(pos));
            Thread readerThread = new Thread(new Reader(pis));

            writerThread.start();
            readerThread.start();

            // Ensure both threads complete execution
            writerThread.join();
            readerThread.join();

        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

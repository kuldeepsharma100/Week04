package filehandling.pipedstream;

import java.io.IOException;
import java.io.PipedInputStream;

class Reader implements Runnable {
    private PipedInputStream pis;

    public Reader(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try {
            System.out.println("Reader: Reading data...");
            byte[] buffer = new byte[1024];
            int bytesRead = pis.read(buffer);
            System.out.println("Reader received: " + new String(buffer, 0, bytesRead));
            pis.close(); // Close stream after reading
        } catch (IOException e) {
            System.out.println("Reader Error: " + e.getMessage());
        }
    }
}


package module3.Q23;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessManager {
    public void processFile(String filePath) {
        try (RandomAccessFile raf = new RandomAccessFile(filePath, "rw")) {
            raf.writeBytes("Hello World! This is a test.");
            
            raf.seek(0);
            byte[] initialBuffer = new byte[(int) raf.length()];
            raf.readFully(initialBuffer);
            System.out.println("Initial Content: " + new String(initialBuffer));

            raf.seek(6);
            raf.writeBytes("JAVA ");

            raf.seek(0);
            byte[] updatedBuffer = new byte[(int) raf.length()];
            raf.readFully(updatedBuffer);
            System.out.println("Updated Content: " + new String(updatedBuffer));

        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}

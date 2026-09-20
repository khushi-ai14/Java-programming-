package module3.Q15;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterByte {
    public void writeToFile(String fileName, String content) {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(content.getBytes());
            System.out.println("Successfully written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

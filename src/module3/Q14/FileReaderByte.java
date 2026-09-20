package module3.Q14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderByte {
    public void readFile(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

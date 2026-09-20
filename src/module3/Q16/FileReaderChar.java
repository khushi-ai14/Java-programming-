package module3.Q16;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderChar {
    public void readFile(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

package module3.Q19;

import java.io.File;
import java.io.IOException;

public class FileChecker {
    public void checkAndCreate(String filePath) {
        File file = new File(filePath);
        try {
            if (file.exists()) {
                System.out.println("File already exists: " + file.getAbsolutePath());
            } else {
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getAbsolutePath());
                }
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }
}
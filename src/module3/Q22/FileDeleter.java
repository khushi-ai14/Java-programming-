package module3.Q22;

import java.io.File;

public class FileDeleter {
    public void deleteFile(String filePath) {
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("Error: File does not exist at " + filePath);
            return;
        }

        if (file.delete()) {
            System.out.println("File deleted successfully: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
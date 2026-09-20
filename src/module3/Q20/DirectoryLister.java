package module3.Q20;

import java.io.File;

public class DirectoryLister {
    public void listFiles(String directoryPath) {
        File directory = new File(directoryPath);

        if (!directory.exists()) {
            System.out.println("Error: The directory does not exist.");
            return;
        }

        if (!directory.isDirectory()) {
            System.out.println("Error: The specified path is not a directory.");
            return;
        }

        File[] files = directory.listFiles();

        if (files == null) {
            System.out.println("Error: Unable to access directory content.");
            return;
        }

        if (files.length == 0) {
            System.out.println("Directory is empty.");
        } else {
            System.out.println("Files in directory:");
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("[File] " + file.getName());
                } else if (file.isDirectory()) {
                    System.out.println("[Folder] " + file.getName());
                }
            }
        }
    }
}
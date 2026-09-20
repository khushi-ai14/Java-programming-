package module3.Q20;

import java.util.Scanner;

public class TestDirectoryLister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String path = scanner.nextLine();

        DirectoryLister lister = new DirectoryLister();
        lister.listFiles(path);

        scanner.close();
    }  
}

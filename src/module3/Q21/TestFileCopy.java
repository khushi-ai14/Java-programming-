package module3.Q21;

public class TestFileCopy {
    public static void main(String[] args) {
        FileCopyManager manager = new FileCopyManager();
        manager.copyFile("source.txt", "destination.txt");
    }
}

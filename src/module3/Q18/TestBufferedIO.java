package module3.Q18;

public class TestBufferedIO {
    public static void main(String[] args) {
        BufferedFileManager manager = new BufferedFileManager();
        
        manager.writeToFile("buffered_example.txt", "Hello, Buffered I/O Stream!");
        manager.readFile("buffered_example.txt");
    }
    
}

package module3.Q15;


public class TestByteWrite {
    public static void main(String[] args) {
        FileWriterByte writer = new FileWriterByte();
        writer.writeToFile("output.txt", "Java I/O Streams Example");
    }
}


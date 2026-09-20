package module3.Q10;

public class TestOddEven {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread oddThread = new Thread(() -> printer.printOdd());
        Thread evenThread = new Thread(() -> printer.printEven());

        oddThread.start();
        evenThread.start();
    } 
}

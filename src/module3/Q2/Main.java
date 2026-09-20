package module3.Q2;

public class Main {
    public static void main(String[] args) {

        ReverseThread obj = new ReverseThread();

        Thread t = new Thread(obj);

        t.start();
    }
}


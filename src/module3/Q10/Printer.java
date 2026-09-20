package module3.Q10;

public class Printer {
    private int number = 1;
    private final int MAX = 20;

    public synchronized void printOdd() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    break;
                }
            } else {
                System.out.println("Odd:  " + number);
                number++;
                notify();
            }
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    break;
                }
            } else {
                System.out.println("Even: " + number);
                number++;
                notify();
            }
        }
    }
    
}

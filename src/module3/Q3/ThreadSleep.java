package module3.Q3;

public class ThreadSleep {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("Thread 1");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread 1 stopped.");
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("  Thread 2");
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread 2 stopped.");
            }
        });

        t1.start();
        t2.start();
    }
}


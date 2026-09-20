package module3.Q12;

public class TestLockCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 5000; i++) {
                counter.incrementUnsafe();
                counter.incrementSafe();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Expected count : 10000");
        System.out.println("Unsafe count   : " + counter.unsafeCount + " (Race condition)");
        System.out.println("Safe count     : " + counter.safeCount + " (Accurate with ReentrantLock)");
    }
}
    


package module3.Q12;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    public int unsafeCount = 0;
    public int safeCount = 0;
    
    private ReentrantLock lock = new ReentrantLock();
    public void incrementUnsafe() {
        unsafeCount++;
    }

    public void incrementSafe() {
        lock.lock();
        try {
            safeCount++;
        } finally {
            lock.unlock(); 
        }
    }
}
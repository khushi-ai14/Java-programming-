package module3.Q13;

import java.util.concurrent.locks.ReentrantLock;

public class TestDeadlockFix {
    public static void main(String[] args) {
        ReentrantLock lock1 = new ReentrantLock();
        ReentrantLock lock2 = new ReentrantLock();
        LockTask task = new LockTask();

        Thread t1 = new Thread(() -> task.execute(lock1, lock2, "Thread 1"));
        Thread t2 = new Thread(() -> task.execute(lock2, lock1, "Thread 2"));

        t1.start();
        t2.start();
    }
}
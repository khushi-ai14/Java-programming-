package module3.Q13;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class LockTask {

    public void execute(ReentrantLock firstLock, ReentrantLock secondLock, String threadName) {
        try {
            if (firstLock.tryLock(500, TimeUnit.MILLISECONDS)) {
                try {
                    System.out.println(threadName + " acquired first lock.");
                    Thread.sleep(100);

                    System.out.println(threadName + " trying to acquire second lock...");
                    
                    if (secondLock.tryLock(500, TimeUnit.MILLISECONDS)) {
                        try {
                            System.out.println(threadName + " acquired BOTH locks! Task finished successfully.");
                        } finally {
                            secondLock.unlock();
                        }
                    } else {
                        System.out.println(threadName + " timed out waiting for second lock. Releasing first lock to prevent deadlock!");
                    }

                } finally {
                    firstLock.unlock();
                }
            } else {
                System.out.println(threadName + " could not acquire first lock.");
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }
    }
}
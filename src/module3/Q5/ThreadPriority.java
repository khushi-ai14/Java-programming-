package module3.Q5;

public class ThreadPriority{

    public static void main(String[] args) {
        Runnable task = () -> {
            Thread current = Thread.currentThread();
            for (int i = 1; i <= 3; i++) {
                System.out.println(current.getName() + " [Priority: " + current.getPriority() + "] - Step " + i);
                try {
                    Thread.sleep(100); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        Thread worker1 = new Thread(task, "Worker-1");
        Thread worker2 = new Thread(task, "Worker-2");
        Thread worker3 = new Thread(task, "Worker-3");

        worker1.setPriority(Thread.MIN_PRIORITY);  
        worker2.setPriority(Thread.NORM_PRIORITY); 
        worker3.setPriority(Thread.MAX_PRIORITY);  

        System.out.println("Starting threads...\n");
        worker1.start();
        worker2.start();
        worker3.start();
    }
}


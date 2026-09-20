package module3.Q6;

public class DaemonThread{

    public static void main(String[] args) throws InterruptedException {
        
        Thread autoSaveThread = new Thread(() -> {
            while (true) {
                System.out.println("Auto-Save in progress...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });

        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        System.out.println("Main thread: File processing started.");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Processing chunk " + i + " out of 5...");
            Thread.sleep(2000);
        }

        System.out.println("Main thread: File processing complete!");
    }
}
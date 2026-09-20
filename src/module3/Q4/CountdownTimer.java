package module3.Q4;

public class CountdownTimer {
    public static void main(String[] args) {
        Thread countdownThread = new Thread(() -> {
            try {
                for (int i = 10; i >= 1; i--) {
                    System.out.println("Countdown: " + i);
                    Thread.sleep(1000);
                }
                System.out.println("Countdown Complete!");
            } catch (InterruptedException e) {
                System.out.println("Countdown interrupted.");
            }
        });

        Thread tickThread = new Thread(() -> {
            try {
                while (countdownThread.isAlive()) {
                    System.out.println("  Tick...");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Tick interrupted.");
            }
        });

        countdownThread.start();
        tickThread.start();
    }
}


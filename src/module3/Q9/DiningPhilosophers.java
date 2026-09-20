package module3.Q9;

public class DiningPhilosophers {
    public static void main(String[] args) {
        
        Object chopstick1 = new Object();
        Object chopstick2 = new Object();

       
        Thread philosopher1 = new Thread(() -> {
            synchronized (chopstick1) {
                System.out.println("Philosopher 1 picked up Chopstick 1.");
                try { 
                    Thread.sleep(100); 
                } 
                catch (InterruptedException e) {}

                System.out.println("Philosopher 1 waiting for Chopstick 2...");
                synchronized (chopstick2) {
                    System.out.println("Philosopher 1 is eating!");
                }
            }
        });

        Thread philosopher2 = new Thread(() -> {
            synchronized (chopstick2) {
                System.out.println("Philosopher 2 picked up Chopstick 2.");
                try { 
                    Thread.sleep(100); 
                } 
                catch (InterruptedException e) {}

                System.out.println("Philosopher 2 waiting for Chopstick 1...");
                synchronized (chopstick1) {
                    System.out.println("Philosopher 2 is eating!");
                }
            }
        });

        philosopher1.start();
        philosopher2.start();
    }
}    

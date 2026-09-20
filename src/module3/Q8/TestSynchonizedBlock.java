package module3.Q8;

public class TestSynchonizedBlock {
    public static void main(String[] args) {
        Inventory store = new Inventory();

        Thread t1 = new Thread(() -> store.reduceStock("Customer 1", 4));
        Thread t2 = new Thread(() -> store.reduceStock("Customer 2", 5));
        Thread t3 = new Thread(() -> store.reduceStock("Customer 3", 3));

        t1.start();
        t2.start();
        t3.start();
    }
    
}

package module3.Q8;

public class Inventory {
    int stock = 10;

    public void reduceStock(String name, int quantity) {
        synchronized (this) {
            if (stock >= quantity) {
                System.out.println(name + " bought " + quantity + " items.");
                stock = stock - quantity;
                System.out.println("Remaining stock: " + stock);
            } else {
                System.out.println(name + " failed to buy. Out of stock!");
            }
        }
    }
    
}

package module4.Q4;

class Box<T> {
    T item;

    void addItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.addItem("Hello");
        System.out.println(b1.getItem());

        Box<Integer> b2 = new Box<>();
        b2.addItem(100);
        System.out.println(b2.getItem());
    }
}
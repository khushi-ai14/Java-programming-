package module4.Q1;

class NumberBox<T extends Number> {
    T value;

    NumberBox(T value) {
        this.value = value;
    }

    void display() {
        System.out.println(value);
    }
}

public class NumberBoxDemo{
    public static void main(String[] args) {
        NumberBox<Integer> n1 = new NumberBox<>(10);
        NumberBox<Double> n2 = new NumberBox<>(15.5);

        n1.display();
        n2.display();
    }
}
package module4.Q3;

class Pair<K, V> {
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return value;
    }

    void setKey(K key) {
        this.key = key;
    }

    void setValue(V value) {
        this.value = value;
    }
}

public class Class {
    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair<>(1, "Java");

        System.out.println(p.getKey());
        System.out.println(p.getValue());

        p.setValue("Python");
        System.out.println(p.getValue());
    }
}
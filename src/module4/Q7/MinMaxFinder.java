package module4.Q7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MinMax<T extends Comparable<T>> {
    List<T> list;

    MinMax(List<T> list) {
        this.list = list;
    }

    T findMin() {
        return Collections.min(list);
    }

    T findMax() {
        return Collections.max(list);
    }
}

public class MinMaxFinder {
    public static void main(String[] args) {
        MinMax<Integer> a =
            new MinMax<>(Arrays.asList(10, 5, 30, 20));

        System.out.println("Minimum: " + a.findMin());
        System.out.println("Maximum: " + a.findMax());

        MinMax<String> b =
            new MinMax<>(Arrays.asList("Apple", "Mango", "Banana"));

        System.out.println("Minimum: " + b.findMin());
        System.out.println("Maximum: " + b.findMax());
    }
}
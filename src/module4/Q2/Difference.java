package module4.Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Difference {
    static double sum(List<? extends Number> list) {
        double total = 0;

        for (Number n : list) {
            total += n.doubleValue();
        }

        return total;
    }

    static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        System.out.println("Sum: " + sum(numbers));

        List<Number> values = new ArrayList<>();
        addNumbers(values);
        System.out.println("Values: " + values);
    }
}
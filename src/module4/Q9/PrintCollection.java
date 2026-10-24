package module4.Q9;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintCollection {
    static <T> void printAll(Collection<T> collection) {
        for (T item : collection) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30);
        Set<String> set = new HashSet<>(
            Arrays.asList("Java", "Python", "C"));

        System.out.println("List elements:");
        printAll(list);

        System.out.println("Set elements:");
        printAll(set);
    }
}
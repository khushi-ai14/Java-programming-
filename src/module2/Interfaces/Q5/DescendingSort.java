package module2.Interfaces.Q5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DescendingSort {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(
                Arrays.asList("Red", "Black", "Yellow", "Orange", "Pink")
        );

        names.sort((a, b) -> b.compareTo(a));

        System.out.println("Descending order:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}

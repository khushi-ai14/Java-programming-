package module4.Q8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListIteration {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);

        System.out.println("Simple for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Enhanced for loop:");
        for (int n : list) {
            System.out.println(n);
        }

        System.out.println("While loop with Iterator:");
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
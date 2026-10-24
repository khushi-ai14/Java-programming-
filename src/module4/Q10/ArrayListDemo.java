package module4.Q10;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Mango");
        list.add("Banana");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
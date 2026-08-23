package module2.definePackages.Q3;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(8);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("List of integers:");

        for (int num : numbers) {
            System.out.println(num);
        }
    }   
}

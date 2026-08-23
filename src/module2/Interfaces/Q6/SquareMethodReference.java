package module2.Interfaces.Q6;

import java.util.function.Function;

public class SquareMethodReference {

    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        Function<Integer, Integer> result = SquareMethodReference::square;

        int number = 6;

        System.out.println("Square = " + result.apply(number));
    }
}

package module4.Q5;

import java.util.Arrays;

public class SwapDemo {
    static <T> void swapElements(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] a = {10, 20, 30};
        swapElements(a, 0, 2);
        System.out.println(Arrays.toString(a));

        String[] b = {"Java", "Python", "C"};
        swapElements(b, 0, 1);
        System.out.println(Arrays.toString(b));
    }
}
package module1.Arrays.Q30;

public class BinarySearch {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int search = 20;

        int start = 0;
        int end = numbers.length - 1;
        boolean found = false;

        while (start <= end) {

            int middle = (start + end) / 2;

            if (numbers[middle] == search) {
                found = true;
                break;
            }
            else if (numbers[middle] < search) {
                start = middle + 1;
            }
            else {
                end = middle - 1;
            }
        }

        if (found) {
            System.out.println(search + " is found");
        } else {
            System.out.println(search + " is not found");
        }
    }  
}

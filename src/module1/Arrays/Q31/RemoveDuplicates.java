package module1.Arrays.Q31;

public class RemoveDuplicates {
     public static void main(String[] args) {

        int[] numbers = {11, 20, 11, 30, 20};

        System.out.println("Array without duplicates:");

        for (int i = 0; i < numbers.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}

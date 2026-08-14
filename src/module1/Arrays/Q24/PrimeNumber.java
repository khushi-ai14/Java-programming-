package module1.Arrays.Q24;

public class PrimeNumber {
    public static void main(String[] args) {

        int number = 8;
        boolean prime = true;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime && number > 1) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}

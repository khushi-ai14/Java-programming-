package module1.DataTypesControl.Q15;

public class PrimeNumber {
     void checkPrime(int num) {

        int i = 2;
        boolean prime = true;

        while (i < num) {

            if (num % i == 0) {
                prime = false;
                break;
            }

            i++;
        }

        if (prime && num > 1) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    public static void main(String[] args) {

        PrimeNumber pn = new PrimeNumber();
        pn.checkPrime(7);
    }
}

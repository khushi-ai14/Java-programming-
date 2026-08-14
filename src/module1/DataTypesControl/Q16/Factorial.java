package module1.DataTypesControl.Q16;

public class Factorial {
    int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Factorial fact = new Factorial();

        int result = fact.factorial(5);

        System.out.println("Factorial: " + result);
    }
}


package module1.Arrays.Q21;

public class Factorial {
    static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int number = 5;

        System.out.println("Factorial: " + factorial(number));
    }  
}

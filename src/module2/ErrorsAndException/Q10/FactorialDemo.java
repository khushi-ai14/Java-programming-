package module2.ErrorsAndException.Q10;

import java.util.Scanner;

public class FactorialDemo {
    static long factorial(int n) throws NegativeNumberException {

        if (n < 0) {
            throw new NegativeNumberException(
                    "Factorial cannot be calculated for a negative number."
            );
        }

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        try {
            long result = factorial(number);
            System.out.println("Factorial = " + result);
        } 
        catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}

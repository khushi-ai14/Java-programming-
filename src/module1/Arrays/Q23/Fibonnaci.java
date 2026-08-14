package module1.Arrays.Q23;

public class Fibonnaci {
    public static void main(String[] args) {

        int n = 12;
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }   
}

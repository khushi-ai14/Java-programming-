package module1.Operators.Q33;

public class StringComparison {
    public static void main(String[] args) {

        String a = "Hello";
        String b = new String("Hello");

        System.out.println("Using == : " + (a == b));
        System.out.println("Using equals() : " + a.equals(b));
    }
}

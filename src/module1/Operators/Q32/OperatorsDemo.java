package module1.Operators.Q32;

public class OperatorsDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        // Relational operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));

        // Logical operators
        System.out.println("a > 20 || b < 10: " + (a > 20 || b < 10));
        System.out.println("a > 5 && b < 10: " + (a > 5 && b < 10));
    }
    
}

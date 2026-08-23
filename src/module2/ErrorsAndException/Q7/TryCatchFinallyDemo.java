package module2.ErrorsAndException.Q7;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Try-Catch: Cannot divide by zero.");
        }

        try {
            int result = 20 / 0;
            System.out.println(result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Try-Catch-Finally: Cannot divide by zero.");
        } 
        finally {
            System.out.println("Finally block always executes.");
        }
    }
    
}

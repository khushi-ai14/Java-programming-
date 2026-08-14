package module1.Operators.Q36;

public class PrecedenceOperator {
    public static void main(String[] args) {

        int result = 10 + 5 * 2;
        System.out.println("Result without bracketss : " + result);

        int result2 = (10 + 5) * 2;
        System.out.println("Result with brackets: " + result2);
    }  
}

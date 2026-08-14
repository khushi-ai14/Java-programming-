package module1.OOPConcepts.Q4;

class AdvancedCalculator extends Calculator {

    // Method Overriding
    void display() {
        System.out.println("Advanced Calculator");
    }
}

public class MethodOverloadingOverriding {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Sum of 2 no.: " + c.add(10, 20));
        System.out.println("Sum of 3 no.: " + c.add(10, 20, 30));

        AdvancedCalculator ac = new AdvancedCalculator();
        ac.display();
    }
}
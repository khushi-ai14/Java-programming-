package module3.Q24;

public class MathDemo {
    public void demonstrateMathFunctions() {
        double randomVal = Math.random();
        System.out.println("Random Value (0.0 to 1.0): " + randomVal);

        int absVal = Math.abs(-25);
        System.out.println("Absolute Value of -25: " + absVal);

        double powVal = Math.pow(2, 3);
        System.out.println("2 raised to power 3: " + powVal);
    }
}

class TestMathDemo {
    public static void main(String[] args) {
        MathDemo demo = new MathDemo();
        demo.demonstrateMathFunctions();
    }
}

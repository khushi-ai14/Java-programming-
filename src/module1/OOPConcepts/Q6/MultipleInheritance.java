package module1.OOPConcepts.Q6;

public class MultipleInheritance implements Shape, Color {

    public void draw() {
        System.out.println("Drawing a circle");
    }

    public void color() {
        System.out.println("Circle is red");
    }

    public static void main(String[] args) {

        MultipleInheritance m = new MultipleInheritance();

        m.draw();
        m.color();
    }
}

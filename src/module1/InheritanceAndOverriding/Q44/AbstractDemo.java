package module1.InheritanceAndOverriding.Q44;

public class AbstractDemo extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {

        AbstractDemo obj = new AbstractDemo();

        obj.sound();
    }
}
    

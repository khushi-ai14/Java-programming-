package module1.InheritanceAndOverriding.Q43;

public class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");

        super.sound();
    }

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
    }
}
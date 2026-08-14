package module1.OOPConcepts.Q2;

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class InheritancePolymorphism {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
    }
}
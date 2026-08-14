package module1.OOPConcepts.Q5;

public class Polymorphism {
    public static void main(String[] args) {

        AnimalType a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}

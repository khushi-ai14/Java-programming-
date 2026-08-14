package module1.OOPConcepts.Q3;

public class Abstraction {
    class Dog implements Animal1 {

    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Animal1 a = new Dog();
        a.sound();
    }
}


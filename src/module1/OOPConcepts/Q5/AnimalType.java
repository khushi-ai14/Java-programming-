package module1.OOPConcepts.Q5;

public class AnimalType {
     void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends AnimalType {

    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends AnimalType {

    void sound() {
        System.out.println("Cat meows");
    }
}
    

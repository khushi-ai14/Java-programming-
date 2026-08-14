package module1.InheritanceAndOverriding.Q46;

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts");
    }
}

class Bike extends Vehicle {

    void start() {
        System.out.println("Bike starts");
    }
}

public class DynamicDispatch {

    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.start();

        v = new Bike();
        v.start();
    }
}

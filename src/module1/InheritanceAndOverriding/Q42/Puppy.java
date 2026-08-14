package module1.InheritanceAndOverriding.Q42;

public class Puppy extends Dog {

    void play() {
        System.out.println("Puppy plays");
    }

    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();
    }
}

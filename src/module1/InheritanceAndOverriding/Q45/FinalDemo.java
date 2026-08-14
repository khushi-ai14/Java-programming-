package module1.InheritanceAndOverriding.Q45;

final class School {
    
    void show() {
        System.out.println("This is a final class");
    }
}

public class FinalDemo {

    public static void main(String[] args) {

        Student s = new Student();
        s.display();

        School obj = new School();
        obj.show();
    }
}

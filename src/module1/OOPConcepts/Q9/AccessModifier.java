package module1.OOPConcepts.Q9;

public class AccessModifier {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("Name: " + s.name);
        System.out.println("Course: " + s.course);

        s.display();
    }
}
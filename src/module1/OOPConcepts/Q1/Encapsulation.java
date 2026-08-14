package module1.OOPConcepts.Q1;

public class Encapsulation {
     public static void main(String[] args) {

        Student s = new Student();

        s.setName("Khushi");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}

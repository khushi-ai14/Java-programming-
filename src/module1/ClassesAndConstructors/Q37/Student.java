package module1.ClassesAndConstructors.Q37;

public class Student {
    String name;
    int age;

    Student() {
        name = "Riya";
        age = 10;
    }

    Student(String n) {
        name = n;
        age = 20;
    }

    Student(String n, int a) {
        name = n;
        age = 30;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Meera");
        Student s3 = new Student("Khushi", 20);

        s1.display();
        s2.display();
        s3.display();
    }   
}

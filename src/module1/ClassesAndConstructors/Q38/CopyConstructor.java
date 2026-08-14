package module1.ClassesAndConstructors.Q38;

public class CopyConstructor {
    String name;
    int age;

    CopyConstructor(String n, int a) {
        name = n;
        age = a;
    }

    CopyConstructor(CopyConstructor s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        CopyConstructor s1 = new CopyConstructor("Khushi", 20);

        CopyConstructor s2 = new CopyConstructor(s1);

        System.out.println("Original:");
        s1.display();

        System.out.println("Copied:");
        s2.display();
    }
    
}

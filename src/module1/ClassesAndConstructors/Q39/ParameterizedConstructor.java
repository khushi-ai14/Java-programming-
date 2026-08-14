package module1.ClassesAndConstructors.Q39;

public class ParameterizedConstructor {

    String name;
    int age;

    ParameterizedConstructor(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        ParameterizedConstructor s =
                new ParameterizedConstructor("Khushi", 20);

        s.display();
    }
    
}

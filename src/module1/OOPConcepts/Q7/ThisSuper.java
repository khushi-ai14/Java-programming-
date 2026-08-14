package module1.OOPConcepts.Q7;

class CollegeStudent extends Student {

    String name = "Khushi";

    void display() {

        System.out.println("Name using this: " + this.name);
        System.out.println("Name using super: " + super.name);

        super.display();
    }
}

public class ThisSuper {

    public static void main(String[] args) {

        CollegeStudent s = new CollegeStudent();

        s.display();
    }
}
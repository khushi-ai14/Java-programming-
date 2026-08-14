package module1.ClassesAndConstructors.Q40;

public class StaticNonStatic {

    static void staticMethod() {
        System.out.println("This is a static method");
    }

    void nonStaticMethod() {
        System.out.println("This is a non-static method");
    }

    public static void main(String[] args) {

        staticMethod();

        StaticNonStatic s1= new StaticNonStatic();
        s1.nonStaticMethod();
    }    
}

package module1.ClassesAndConstructors.Q41;

public class Singleton {
   
    private static Singleton obj;

    private Singleton() {
        System.out.println("Object created");
    }

    public static Singleton getObject() {

        if (obj == null) {
            obj = new Singleton();
        }

        return obj;
    }

    public static void main(String[] args) {

        Singleton s1 = Singleton.getObject();
        Singleton s2 = Singleton.getObject();

        System.out.println(s1 == s2);
    }
}

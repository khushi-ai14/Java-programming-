package module1.OOPConcepts.Q12;

public class StringImmutability {
     public static void main(String[] args) {

        String name = "hello";
        System.out.println("Original String: " + name);

        name.concat("world");
        System.out.println("After concat: " + name);

        name = name.concat("world ");
        System.out.println("After assigning: " + name);
    }
}

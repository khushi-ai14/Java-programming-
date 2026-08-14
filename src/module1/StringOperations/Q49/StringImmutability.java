package module1.StringOperations.Q49;

public class StringImmutability {
    public static void main(String[] args) {

        String name = "Hello";
        System.out.println("Original: " + name);

        name.concat(" World");
        System.out.println("After concat: " + name);

        name = name.concat(" World");
        System.out.println("After assigning: " + name);
    }  
}

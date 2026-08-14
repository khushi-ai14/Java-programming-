package module1.OOPConcepts.Q11;

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder text = new StringBuilder("Hello");

        text.append(" Khushi");
        System.out.println("After append: " + text);

        text.insert(6, "Java ");
        System.out.println("After insert: " + text);

        text.reverse();
        System.out.println("After reverse: " + text);
    }
}

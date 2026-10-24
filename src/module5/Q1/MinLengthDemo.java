package module5.Q1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MinLength {
    int value();
}

class User {
    @MinLength(5)
    String name = "Khushi";
}

public class MinLengthDemo {
    public static void main(String[] args) {
        User u = new User();

        System.out.println("Name: " + u.name);
        System.out.println("Minimum length: 5");
    }
}
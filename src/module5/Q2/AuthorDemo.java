package module5.Q2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
    String version();
}

@Author(name = "Khushi", version = "1.0")
class MyClass {
}

public class AuthorDemo {
    public static void main(String[] args) {
        System.out.println("Custom annotation created");
    }
}

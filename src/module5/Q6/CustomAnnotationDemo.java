package module5.Q6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String message();
}

@MyAnnotation(message = "Hello Java")
class Test {
}

public class CustomAnnotationDemo {
    public static void main(String[] args) {
        MyAnnotation a =
            Test.class.getAnnotation(MyAnnotation.class);

        System.out.println(a.message());
    }
}

package module5.Q3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface Info {
    String value();
}

class Student {
    @Info("Student name")
    String name;
}

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Field f = Student.class.getDeclaredField("name");

        Info info = f.getAnnotation(Info.class);

        System.out.println(info.value());
    }
}
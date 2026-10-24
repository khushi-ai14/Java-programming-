package module5.Q4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Subjects {
    String[] value();
}

@Subjects({"Java", "Python", "C"})
class Course {
}

public class ArrayAnnotationDemo {
    public static void main(String[] args) {
        Subjects s = Course.class.getAnnotation(Subjects.class);

        for (String subject : s.value()) {
            System.out.println(subject);
        }
    }
}
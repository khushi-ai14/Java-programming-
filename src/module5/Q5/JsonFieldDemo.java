package module5.Q5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String value();
}

class Employee {
    @JsonField("employee_name")
    String name = "Aman";
}

public class JsonFieldDemo {
    public static void main(String[] args) throws Exception {
        Field f = Employee.class.getDeclaredField("name");

        JsonField j = f.getAnnotation(JsonField.class);

        System.out.println(j.value());
    }
}
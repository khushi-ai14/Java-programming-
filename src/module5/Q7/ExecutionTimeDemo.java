package module5.Q7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogTime {
}

public class ExecutionTimeDemo {
    @LogTime
    public static void display() {
        long start = System.currentTimeMillis();

        System.out.println("Method executed");

        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + " ms");
    }

    public static void main(String[] args) {
        display();
    }
} 

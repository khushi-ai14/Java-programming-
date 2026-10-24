package module4.Q6;

import java.util.ArrayList;

class MyStack<T> {
    ArrayList<T> list = new ArrayList<>();

    void push(T item) {
        list.add(item);
    }

    T pop() {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    T peek() {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }
}

public class GenericStack {
    public static void main(String[] args) {
        MyStack<Integer> s1 = new MyStack<>();
        s1.push(10);
        s1.push(20);
        System.out.println(s1.peek());
        System.out.println(s1.pop());

        MyStack<String> s2 = new MyStack<>();
        s2.push("Java");
        s2.push("Python");
        System.out.println(s2.pop());
    }
}
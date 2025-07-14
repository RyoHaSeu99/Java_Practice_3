import java.lang.reflect.*;

class Person {
    public Person() {
        System.out.println("Person 생성자 호출됨");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Person.class;
            Object obj = clazz.getDeclaredConstructor().newInstance();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
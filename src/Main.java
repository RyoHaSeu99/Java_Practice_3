import java.lang.reflect.*;

class Person {
    private String name;
    public int age;
}

public class Main {
    public static void main(String[] args) {
        Class<?> clazz = Person.class;
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            System.out.println("필드 이름: " + field.getName());
        }
    }
}
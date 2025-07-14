import java.lang.reflect.*;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Calculator.class;
        Object instance = clazz.getDeclaredConstructor().newInstance();

        Method method = clazz.getMethod("add", int.class, int.class);
        Object result = method.invoke(instance, 10, 20);

        System.out.println("결과: " + result);
    }
}
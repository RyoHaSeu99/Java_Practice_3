import java.lang.reflect.*;

class Person {
    public void greet(String name) {}
    private int calculate(int x, int y) { return x + y; }
}
public class Main {
    public static void main(String[] args) {
        Class<?> clazz = Person.class;
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("메서드 이름: " + method.getName());
            for(Class<?> paramType : method.getParameterTypes()) {
                System.out.println(" 파라미터 타입: " + paramType.getSimpleName());
            }
        }
    }
}
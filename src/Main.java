import java.lang.reflect.*;

class Secret {
    private  String reveal(String code) {
        return "Access granted to: " + code;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Secret.class;
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Method method = clazz.getDeclaredMethod("reveal", String.class);
        method.setAccessible(true);

        Object result = method.invoke(obj, "admin");
        System.out.println(result);
    }
}
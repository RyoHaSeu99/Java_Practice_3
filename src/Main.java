import java.lang.reflect.*;

class Secret {
    private void whisper() {
        System.out.println("This is a secret method.");
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Secret.class;
        Object instance = clazz.getDeclaredConstructor().newInstance();

        Method method = clazz.getDeclaredMethod("whisper");
        method.setAccessible(true); // private 접근 허용
        method.invoke(instance);    // 메서드 실행
    }
}
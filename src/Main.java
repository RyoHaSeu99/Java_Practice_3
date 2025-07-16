import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface CustomInfo {
    String author();
    String date();
    int version() default 1;
}

@CustomInfo(author = "John Doe", date = "2025-07-17", version = 2)
class Demo {
    // 내부 로직
}



public class Main {

    @CustomInfo(author = "Jane Smith", date = "2025-07-17")
    public void display() {
        System.out.println("Display method execute.");
    }

    public static void main(String[] args) throws Exception {
        Class<?> demoClass = demo.getClass();
        if (demoClass.isAnnotationPresent(CustomInfo.class));
        CustomInfo info = demoClass.getAnnotation(CustomInfo.class);
        System.out.println("Class -> Author: " + classInfo.author() +
                ", Date: " + classInfo.date() +
                ", Version: " + classInfo.version());


    }
}
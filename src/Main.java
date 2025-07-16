import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface CustomInfo {
    String author();
    String date();
    int version() default 1;
}

public class Main {
    public static void main(String[] args) throws Exception {

    }
}
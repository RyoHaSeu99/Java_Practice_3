import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};

        // 메소드 참조 방식(더 간단함)
        Arrays.stream(names).forEach(System.out::println);

        // 람다식 방식
        Arrays.stream(names).forEach(name -> System.out.println(name));
    }
}
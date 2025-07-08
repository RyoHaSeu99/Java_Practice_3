import java.util.Arrays;
import java.util.List;

public class Main {
    public static void printArray(Object[] arr) {
        for (Object o : arr) System.out.println(o);
    }
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        printArray(numbers);    // Integer 타입 배열을 Object 타입 배열로 처리 가능

        List<Integer> list = Arrays.asList(1, 2, 3);
        List<Object> objList = list;    //  오류 발생
    }
}
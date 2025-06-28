import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");

        System.out.println(fruits.indexOf("Banana"));

        fruits.set(1, "Orange");
        System.out.println(fruits);

        List<String> sliced = fruits.subList(0, 2);
        System.out.println(sliced);
    }
}
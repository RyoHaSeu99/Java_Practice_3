import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrice = new TreeMap<>();

        fruitPrice.put("Banana", 50);
        fruitPrice.put("Cherry", 200);
        fruitPrice.put("Apple", 150);

        for (Map.Entry<String, Integer> entry : fruitPrice.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
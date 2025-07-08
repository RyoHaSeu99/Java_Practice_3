public class Main {
    public static <T> void displayArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] words = {"apple", "banana", "cherry"};

        displayArray(numbers);
        displayArray(words);
    }
}
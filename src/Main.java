public class Main {
    public static void main(String[] args) {
        int[] tokens = {1, 2, 3};

        if (tokens.length != 2) {
            throw new NumberFormatException("숫자가 2개가 아닙니다.");
        }
    }
}
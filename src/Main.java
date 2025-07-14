class Calculator {

    @Deprecated
    public int add(int a, int b) {
        return a + b;
    }

    public int addNumbers(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(1, 2));
        System.out.println(calc.addNumbers(1, 2));
    }
}
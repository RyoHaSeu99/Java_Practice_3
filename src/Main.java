public class Main {
    String outerMessage = "Hello from Outer";

    class Inner {
        void showMessage() {
            System.out.println(outerMessage);
        }
    }
    public static void main(String[] args) {
        // 1. Outer 객체 생성
        Main outer = new Main();

        // 2. Inner 객체 생성
        Main.Inner inner = outer.new Inner();

        // 3. Inner 클래스 메서드 호출
        inner.showMessage();
    }
}
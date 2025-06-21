public class Main {
    private String message = "Hello from the outer class!";

    class InnerClass {
        private void displayMessage() {
            System.out.println("Inner says: " + message);
        }
    }

    public void callInner() {
        InnerClass inner = new InnerClass();
        inner.displayMessage();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.callInner();
    }
}
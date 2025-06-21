class Outer {
    private class HiddenInner {
        void secret() {
            System.out.println("This is private!");
        }
    }

    public void reveal() {
        HiddenInner hi = new HiddenInner();
        hi.secret();
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.reveal();
    }
}
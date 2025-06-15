class Example {
    public int a = 1;
    int b = 2;
    protected int c = 3;
    private int d = 4;

    public void displayFields() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class Main {
    public static void main(String[] args) {
        Example ex = new Example();

        ex.displayFields();
//        System.out.println(ex.a);
//        System.out.println(ex.b);
//        System.out.println(ex.c);
//        System.out.println(ex.d);


    }
}
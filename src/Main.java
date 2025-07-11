class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("MyRunnable was interrupted.");
            }
        }
    }
}

public class Main {
    public static void test() {
        for (int i = 1; i <=5; i++) {
            System.out.println("Test");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("MyThread was interrupted.");
            }
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        test();
    }
}
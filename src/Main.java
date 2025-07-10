class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyThread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("MyThread was interrupted.");
            }
        }
    }

    public void test() {
        for (int i = 1; i <=5; i++) {
            System.out.println("Test");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("MyThread was interrupted.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        thread.test();
    }
}
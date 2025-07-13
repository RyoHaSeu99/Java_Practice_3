class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from Thread: " + i);
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Thread runnable = new Thread(new MyRunnable());
        runnable.start();
    }
}
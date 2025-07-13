class SumRunnable implements Runnable {
    private final int[] numbers;

    public SumRunnable(int[] numbers) {
        this.numbers = numbers;
    }

    public void run() {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
        System.out.println(Thread.currentThread().getName() + " - Sum: " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] dataSets = {
                {1, 2, 3, 4, 5},
                {10, 20, 30, 40, 50},
                {7, 14, 21, 28, 35},
                {100, 200, 300, 400, 500}
        };

        for (int i = 0; i < dataSets.length; i++) {
            Thread thread = new Thread(new SumRunnable(dataSets[i]), "Thread-" + (i + 1));
            thread.start();
        }

        // 코드가 한 줄씩이 아닌 동시에 실행되기 때문에 sleep 메서드가 적용된 쓰레드보다 아래 코드가 먼저 실행됨
        System.out.println("All sum threads started.");
    }
}
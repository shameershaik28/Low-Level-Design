package LLD1.Concurrency.Threads.Volatile;

public class CounterWorkerWithVolatile extends Thread {
    volatile boolean running = true; // volatile
    long count = 0;

    public void run() {
        while (running) {
            count++;
        }
        System.out.println("Stopped at count = " + count);
    }

    public void stopWork() {
        running = false;
    }
}

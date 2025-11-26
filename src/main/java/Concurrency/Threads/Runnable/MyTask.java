package Concurrency.Threads.Runnable;

public class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

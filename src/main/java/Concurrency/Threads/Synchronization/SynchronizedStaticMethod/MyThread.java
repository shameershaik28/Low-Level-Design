package Concurrency.Threads.Synchronization.SynchronizedStaticMethod;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            Counter.increment();
        }
    }
}

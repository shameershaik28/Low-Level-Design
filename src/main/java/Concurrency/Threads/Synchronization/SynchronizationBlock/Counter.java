package Concurrency.Threads.Synchronization.SynchronizationBlock;

class Counter {
    int count = 0;

    final Object lock = new Object();   // lock object for synchronization

    void increment() {
        // synchronized block
        synchronized (lock) {
            count++;
        }
    }
}

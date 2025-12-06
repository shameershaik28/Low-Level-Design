package LLD1.Concurrency.Threads.Mutex;

import java.util.concurrent.locks.ReentrantLock;

class Counter {
    int count = 0;

    ReentrantLock lock = new ReentrantLock();   // THIS is the mutex

    void increment() {
        lock.lock();   // acquire lock (enter critical section)
        try {
            count++;
        } finally {
            lock.unlock(); // release lock (exit critical section)
        }
    }
}

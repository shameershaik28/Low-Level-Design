package Concurrency.Threads.Atomic.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    AtomicInteger count = new AtomicInteger(0);

    void increment() {
        count.incrementAndGet();   // atomic operation
    }
}


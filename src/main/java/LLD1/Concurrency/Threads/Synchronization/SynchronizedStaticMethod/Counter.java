package LLD1.Concurrency.Threads.Synchronization.SynchronizedStaticMethod;

class Counter {
    static int count = 0;

    // synchronized static method
    synchronized static void increment() {
        count++;
    }
}


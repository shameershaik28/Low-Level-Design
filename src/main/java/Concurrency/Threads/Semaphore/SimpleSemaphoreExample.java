package Concurrency.Threads.Semaphore;

import java.util.concurrent.Semaphore;

public class SimpleSemaphoreExample {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(2); // allow only 2 threads at a time

        new Task(semaphore, "Thread-1").start();
        new Task(semaphore, "Thread-2").start();
        new Task(semaphore, "Thread-3").start();
        new Task(semaphore, "Thread-4").start();
    }
}


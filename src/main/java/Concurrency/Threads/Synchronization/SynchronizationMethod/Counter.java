package Concurrency.Threads.Synchronization.SynchronizationMethod;

public class Counter {
    int count =0;

    synchronized void increment(){ // Synchronized Method
        count++;
    }
}

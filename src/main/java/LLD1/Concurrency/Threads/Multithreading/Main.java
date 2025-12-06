package LLD1.Concurrency.Threads.Multithreading;

public class Main {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        t1.start();   // Thread 1 starts
        t2.start();   // Thread 2 starts (runs parallel)
    }
}

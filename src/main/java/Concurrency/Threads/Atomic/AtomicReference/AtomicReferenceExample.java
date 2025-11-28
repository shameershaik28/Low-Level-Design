package Concurrency.Threads.Atomic.AtomicReference;

public class AtomicReferenceExample {
    public static void main(String[] args) throws Exception {

        SharedData data = new SharedData();

        MyThread t1 = new MyThread(data, "Alice");
        MyThread t2 = new MyThread(data, "Bob");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Name: " + data.personRef.get().name);
    }
}


package LLD1.Concurrency.Threads.Atomic.AtomicInteger;

public class AtomicExample {
    public static void main(String[] args) throws Exception {

        Counter c = new Counter();

        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count = " + c.count.get());
    }
}


package LLD1.Concurrency.Threads.Synchronization.RaceCondition;

public class Main {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        Thread t1 = new Adder(c);
        Thread t2 = new Subtractor(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count); // ❌ NOT always 0
    }
}


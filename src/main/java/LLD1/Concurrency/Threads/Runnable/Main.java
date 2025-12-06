package LLD1.Concurrency.Threads.Runnable;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask());
        Thread t2 = new Thread(new MyTask());

        t1.start();
        t2.start();  // Runs in a separate thread
        t2.run();    // Runs like a normal method (not a thread)


    }

}

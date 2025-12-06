package LLD1.Concurrency.ConcurrentDataStructures.ConcurrentLinkedQueue;


import java.util.concurrent.ConcurrentLinkedQueue;

public class CLQExample {
    public static void main(String[] args) throws Exception {

        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

        new AddTask(queue).start();
        new AddTask(queue).start();
        new AddTask(queue).start();

        Thread.sleep(300); // wait for threads

        System.out.println("Queue values: " + queue);
    }
}

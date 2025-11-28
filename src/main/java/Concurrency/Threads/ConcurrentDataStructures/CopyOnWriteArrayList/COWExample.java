package Concurrency.Threads.ConcurrentDataStructures.CopyOnWriteArrayList;

import java.util.concurrent.CopyOnWriteArrayList;

public class COWExample {
    public static void main(String[] args) throws Exception {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("Start");

        new Worker(list).start();
        new Worker(list).start();
        new Worker(list).start();

        Thread.sleep(200); // wait for threads

        System.out.println("Final List: " + list);
    }
}

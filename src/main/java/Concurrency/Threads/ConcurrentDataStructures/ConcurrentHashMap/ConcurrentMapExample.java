package Concurrency.Threads.ConcurrentDataStructures.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapExample {
    public static void main(String[] args) throws Exception {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        new MyTask(map).start();
        new MyTask(map).start();
        new MyTask(map).start();

        Thread.sleep(500); // wait for threads

        System.out.println("Final Map: " + map);
    }
}

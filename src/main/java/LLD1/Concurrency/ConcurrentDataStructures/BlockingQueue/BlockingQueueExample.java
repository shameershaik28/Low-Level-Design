package LLD1.Concurrency.ConcurrentDataStructures.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);
        // size = 2

        new Producer(queue).start();
        new Consumer(queue).start();
    }
}


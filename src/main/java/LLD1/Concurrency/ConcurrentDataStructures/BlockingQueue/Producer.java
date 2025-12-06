package LLD1.Concurrency.ConcurrentDataStructures.BlockingQueue;

import java.util.concurrent.BlockingQueue;

class Producer extends Thread {
    BlockingQueue<Integer> queue;

    Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                queue.put(i);   // waits if queue is full
                System.out.println("Produced: " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


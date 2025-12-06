package Concurrency.ConcurrentDataStructures.BlockingQueue;

import java.util.concurrent.BlockingQueue;

class Consumer extends Thread {
    BlockingQueue<Integer> queue;

    Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                int item = queue.take();  // waits if queue is empty
                System.out.println("Consumed: " + item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


package Concurrency.ConcurrentDataStructures.ConcurrentLinkedQueue;

import java.util.concurrent.ConcurrentLinkedQueue;

class AddTask extends Thread {
    ConcurrentLinkedQueue<Integer> queue;

    AddTask(ConcurrentLinkedQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        queue.add((int)(Math.random() * 100));
    }
}



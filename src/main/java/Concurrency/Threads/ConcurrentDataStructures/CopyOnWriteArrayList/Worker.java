package Concurrency.Threads.ConcurrentDataStructures.CopyOnWriteArrayList;

import java.util.concurrent.CopyOnWriteArrayList;

class Worker extends Thread {
    CopyOnWriteArrayList<String> list;

    Worker(CopyOnWriteArrayList<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        list.add(Thread.currentThread().getName());
    }
}
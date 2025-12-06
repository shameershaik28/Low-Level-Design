package LLD1.Concurrency.Threads.Semaphore;

import java.util.concurrent.Semaphore;

class Task extends Thread {
    private Semaphore semaphore;
    private String name;

    Task(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();   // take a permit
            System.out.println(name + " entered...");

            Thread.sleep(1000);    // doing work

            System.out.println(name + " leaving...");
            semaphore.release();   // release permit
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


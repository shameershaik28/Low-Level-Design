package LLD1.Concurrency.Threads.Volatile;

class CounterWorkerWithNoVolatile extends Thread {
    boolean running = true;   // NOT volatile


    long count = 0;

    public void run() {
        while (running) {
            count++;
        }
        System.out.println("Stopped at count = " + count);
    }

    public void stopWork() {
        running = false;
    }
}



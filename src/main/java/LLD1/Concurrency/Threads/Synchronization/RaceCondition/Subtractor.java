package LLD1.Concurrency.Threads.Synchronization.RaceCondition;

class Subtractor extends Thread {
    Counter c;

    Subtractor(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 100000; i++) {
            c.subtract();
        }
    }
}

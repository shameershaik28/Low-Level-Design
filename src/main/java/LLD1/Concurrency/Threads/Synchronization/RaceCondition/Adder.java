package LLD1.Concurrency.Threads.Synchronization.RaceCondition;

class Adder extends Thread {
    Counter c;

    Adder(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 100000; i++) {
            c.add();
        }
    }
}

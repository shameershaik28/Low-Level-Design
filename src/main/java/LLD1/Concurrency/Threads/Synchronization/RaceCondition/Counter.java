package LLD1.Concurrency.Threads.Synchronization.RaceCondition;

class Counter {
    int count = 0;

    void add() {
        count++;   // read → modify → write
    }

    void subtract() {
        count--;   // read → modify → write
    }
}


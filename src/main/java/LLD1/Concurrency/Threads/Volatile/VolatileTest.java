package LLD1.Concurrency.Threads.Volatile;

public class VolatileTest {
    public static void main(String[] args) throws InterruptedException {
        CounterWorkerWithVolatile w = new CounterWorkerWithVolatile();
        w.start();

        Thread.sleep(1000);   // let worker run
        w.stopWork();         // may NOT stop worker
    }
}

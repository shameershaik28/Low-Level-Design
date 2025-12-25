package LLD1.Concurrency.Threads.Volatile;

public class NoVolatileTest {
    public static void main(String[] args) throws InterruptedException {
        CounterWorkerWithNoVolatile w = new CounterWorkerWithNoVolatile();
        w.start();

       Thread.sleep(1000);   // let worker run
       w.stopWork();         // may NOT stop worker
    }
}

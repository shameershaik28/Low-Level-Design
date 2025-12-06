package LLD1.Concurrency.Threads.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(3);

        service.submit(new NumberPrinter("Thread-1"));
        service.submit(new NumberPrinter("Thread-2"));
        service.submit(new NumberPrinter("Thread-3"));
        service.shutdown();
    }
}

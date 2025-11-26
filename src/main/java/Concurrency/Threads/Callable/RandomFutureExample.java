package Concurrency.Threads.Callable;

import java.util.concurrent.*;

public class RandomFutureExample {
    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newSingleThreadExecutor();

        Future<Integer> result = service.submit(new RandomTask());

        System.out.println("Waiting for result...");

        Integer number = result.get();   // wait & get result from thread

        System.out.println("Random number: " + number);

        service.shutdown();
    }
}


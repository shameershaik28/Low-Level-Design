package Concurrency.Threads.FutureAndFutureTask;

import java.util.concurrent.*;

public class SimpleFutureExample {
    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newSingleThreadExecutor();

        // submit the task → returns Future
        Future<String> future = service.submit(new MyCallableTask());

        System.out.println("Waiting for result...");

        // get the result from background thread
        String result = future.get();

        System.out.println("Result: " + result);

        service.shutdown();
    }
}


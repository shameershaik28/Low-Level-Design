package Threads.FutureAndFutureTask;

import java.util.concurrent.FutureTask;

public class FutureTaskExample {
    public static void main(String[] args) throws Exception {

        // Wrap Callable inside FutureTask
        FutureTask<String> futureTask = new FutureTask<>(new MyTask());

        // Run FutureTask using a normal thread
        Thread t = new Thread(futureTask);
        t.start();

        System.out.println("Waiting for result...");

        // Get the result
        String result = futureTask.get();

        System.out.println("Result: " + result);
    }
}


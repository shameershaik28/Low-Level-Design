package LLD1.Concurrency.Threads.ThreadPool.ExecutorTypes.SingleThreadExecutorExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorExample {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.execute(() -> System.out.println("Task 1"));
        executor.execute(() -> System.out.println("Task 2"));
        executor.execute(() -> System.out.println("Task 3"));

        executor.shutdown();
    }
}


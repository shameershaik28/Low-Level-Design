package LLD1.Concurrency.Threads.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);


        // submitting 5 tasks (only 3 will run at same time)
        for (int i = 1; i <= 5; i++) {
            executorService.submit(new MyTask(i));
        }

        executorService.shutdown();

    }
}

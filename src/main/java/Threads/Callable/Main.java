package Threads.Callable;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newSingleThreadExecutor();

        Future<String> result = service.submit(new MyTask());

        System.out.println(result.get());  // gets the returned value

        service.shutdown();
    }
}


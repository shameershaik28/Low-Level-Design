package Concurrency.Threads.Callable;

import java.util.concurrent.Callable;

class MyTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Hello from Callable!";
    }
}


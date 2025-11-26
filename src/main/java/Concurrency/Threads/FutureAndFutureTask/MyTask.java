package Concurrency.Threads.FutureAndFutureTask;

import java.util.concurrent.Callable;

//FutureTask example
class MyTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Result from FutureTask!";
    }
}


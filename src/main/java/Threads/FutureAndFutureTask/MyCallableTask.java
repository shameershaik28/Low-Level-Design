package Threads.FutureAndFutureTask;

import java.util.concurrent.Callable;

//Future Example
class MyCallableTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Hello! This is the result from Future.";
    }
}


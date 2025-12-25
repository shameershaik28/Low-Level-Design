package LLD1.Concurrency.Threads.ThreadPool.ExecutorTypes.FixedThreadPoolExample;

public class MyTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Task is running using Executor");
    }
}

package LLD1.Concurrency.Threads.ThreadPool;

class MyTask implements Runnable {
    private int taskId;

    MyTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is running on " + Thread.currentThread().getName());
    }
}


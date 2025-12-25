package LLD1.Concurrency.Threads.ThreadPool.ExecutorService;

class NumberPrinter implements Runnable {

    private String threadName;

    NumberPrinter(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(threadName+ " " + i);
        }
    }
}


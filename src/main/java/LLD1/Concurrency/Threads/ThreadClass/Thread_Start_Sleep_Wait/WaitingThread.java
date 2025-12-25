package LLD1.Concurrency.Threads.ThreadClass.Thread_Start_Sleep_Wait;

class WaitingThread implements Runnable {
    SharedResource resource;

    WaitingThread(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        resource.waitExample();
    }
}


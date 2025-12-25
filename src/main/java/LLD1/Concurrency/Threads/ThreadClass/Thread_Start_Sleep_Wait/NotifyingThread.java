package LLD1.Concurrency.Threads.ThreadClass.Thread_Start_Sleep_Wait;

class NotifyingThread implements Runnable {
    SharedResource resource;

    NotifyingThread(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        try {
            Thread.sleep(2000); // pauses current thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resource.notifyExample();
    }
}

/*
What happens:

Thread-2 pauses for 2 seconds

Thread-2 does NOT release any lock

Thread-1 is still waiting

sleep() affects only the current thread

notifyExample() is called
 */


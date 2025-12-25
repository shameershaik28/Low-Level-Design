package LLD1.Concurrency.Threads.ThreadClass.Thread_Start_Sleep_Wait;

class SharedResource {

    synchronized void waitExample() {
        try {

            System.out.println(Thread.currentThread().getName() + " is waiting...");
            wait(); // releases lock and waits
            System.out.println(Thread.currentThread().getName() + " resumed after notify");
            System.out.println("So, This is what happened : Thread-1 acquires the lock and calls wait(), releasing the lock and entering waiting state." +
                    " Thread-2 sleeps for some time then acquires the same lock and calls notify()." +
                    " Once Thread-2 releases the lock, Thread-1 resumes execution." +

                    "“Thread-1 should pause and wait until some other thread finishes work and signals me.”");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void notifyExample() {
        System.out.println(Thread.currentThread().getName() + " is notifying...");
        notify(); // wakes up waiting thread
    }
}

/*
What happens internally:

Thread-1 acquires the lock on resource

No other thread can enter synchronized methods on resource

wait() is called

Thread-1 releases the lock

Thread-1 goes into WAITING state

Thread-1 stops execution

Thread-1 waits for notify() or notifyAll()

 */


/*
notifyExample() is called

Thread-2 acquires the lock on resource

Lock is available because Thread-1 released it earlier

notify() is called


so,
Thread-1 acquires the lock and calls wait(), releasing the lock and entering waiting state.
Thread-2 sleeps for some time, then acquires the same lock and calls notify().
Once Thread-2 releases the lock, Thread-1 resumes execution.”
 */
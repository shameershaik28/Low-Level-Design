package LLD1.Concurrency.Threads.ThreadClass.Thread_Start_Sleep_Wait;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
        One SharedResource object is created
        This object will be shared by multiple threads
        Important because wait() / notify() work on same object
         */

        SharedResource resource = new SharedResource();

        /*
What happens here:
WaitingThread and NotifyingThread objects are created
They both receive the same resource
Thread objects are created but No thread is running yet
Creating a Thread object ≠ starting a thread
         */

        Thread t1 = new Thread(new WaitingThread(resource), "Thread-1");
        Thread t2 = new Thread(new NotifyingThread(resource), "Thread-2");

        t1.start(); // creates new thread
        t2.start(); // creates new thread
    }
}


package Concurrency.Threads.Multithreading;

class Task1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 1 : " + i);
        }
    }
}


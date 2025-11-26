package Concurrency.Threads.ThreadClass;

public class Main {
	public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        System.out.println("Main Thread Started");
    }
}

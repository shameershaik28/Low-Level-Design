package OOPS.AnonymousClass.UsingRunnable;

public class DemoRunnable {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running using Anonymous Runnable");
            }
        });

        t.start();
    }
}


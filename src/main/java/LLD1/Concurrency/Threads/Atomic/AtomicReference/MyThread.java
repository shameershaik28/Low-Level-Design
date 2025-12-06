package LLD1.Concurrency.Threads.Atomic.AtomicReference;

class MyThread extends Thread {
    SharedData data;
    String newName;

    MyThread(SharedData data, String newName) {
        this.data = data;
        this.newName = newName;
    }

    @Override
    public void run() {
        Person newPerson = new Person(newName);

        // atomic update
        data.personRef.set(newPerson);

        System.out.println(Thread.currentThread().getName() +
                " updated name to: " + data.personRef.get().name);
    }
}


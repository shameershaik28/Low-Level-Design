package Concurrency.Threads.Atomic.AtomicBoolean;

class Person extends Thread {
    Door door;

    Person(Door door) {
        this.door = door;
    }

    @Override
    public void run() {
        door.openDoor();
    }
}


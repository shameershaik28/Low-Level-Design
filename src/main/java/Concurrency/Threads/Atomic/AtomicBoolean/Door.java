package Concurrency.Threads.Atomic.AtomicBoolean;

import java.util.concurrent.atomic.AtomicBoolean;

class Door {
    AtomicBoolean isOpen = new AtomicBoolean(false);

    void openDoor() {
        if (isOpen.compareAndSet(false, true)) {
            System.out.println(Thread.currentThread().getName() + " OPENED the door");
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to open, but door is ALREADY open");
        }
    }
}


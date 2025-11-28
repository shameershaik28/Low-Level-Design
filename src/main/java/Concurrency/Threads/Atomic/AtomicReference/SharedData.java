package Concurrency.Threads.Atomic.AtomicReference;

import java.util.concurrent.atomic.AtomicReference;

class SharedData {
    AtomicReference<Person> personRef = new AtomicReference<>(new Person("Default"));
}


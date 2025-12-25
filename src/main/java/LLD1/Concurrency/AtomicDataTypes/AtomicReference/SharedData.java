package LLD1.Concurrency.AtomicDataTypes.AtomicReference;

import java.util.concurrent.atomic.AtomicReference;

class SharedData {
    AtomicReference<Person> personRef = new AtomicReference<>(new Person("Default"));
}


package LLD1.Concurrency.AtomicDataTypes.AtomicBoolean;

public class AtomicBooleanExample {
    public static void main(String[] args) {

        Door door = new Door();

        new Person(door).start();
        new Person(door).start();
        new Person(door).start();
        new Person(door).start();
    }
}


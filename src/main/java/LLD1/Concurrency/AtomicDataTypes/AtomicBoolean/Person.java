package LLD1.Concurrency.AtomicDataTypes.AtomicBoolean;

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


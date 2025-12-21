package LLD2.DesignPatterns.CreationalType.Singleton.SynchronizedMethod;

class Singleton {

    private static Singleton instance;

    // Private constructor
    private Singleton() {}

    // Synchronized method → Thread-safe
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Thread-safe Singleton (Synchronized Method)");
    }
}


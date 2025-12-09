package LLD2.DesignPatterns.Singleton.EagerInitialization;

class Singleton {

    // Instance created at class-loading time
    private static final Singleton instance = new Singleton();

    // Private constructor to prevent external object creation
    private Singleton() {}

    // Return the already-created instance
    public static Singleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Eager Initialization Singleton");
    }
}


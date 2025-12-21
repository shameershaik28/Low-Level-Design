package LLD2.DesignPatterns.CreationalType.Singleton.LazyInitialization;

class Singleton {

    // 1️⃣ Create a private static instance variable
    private static Singleton instance;

    // 2️⃣ Private constructor so object cannot be created from outside
    private Singleton() { }

    // 3️⃣ Public static method - creates only one instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  // create object if not created
        }
        return instance;  // return same object always
    }

    public void showMessage() {
        System.out.println("Singleton object created!");
    }
}

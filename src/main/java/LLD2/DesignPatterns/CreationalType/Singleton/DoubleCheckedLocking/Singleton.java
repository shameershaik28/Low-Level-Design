package LLD2.DesignPatterns.CreationalType.Singleton.DoubleCheckedLocking;

class Singleton {

    // volatile prevents memory inconsistency problems
    private static volatile Singleton instance;

    // private constructor
    private Singleton() {}

    public static Singleton getInstance() {

        // 1️⃣ First check (no locking) → improves performance
        if (instance == null) {

            // 2️⃣ Lock only when instance is null
            synchronized (Singleton.class) {

                // 3️⃣ Second check → ensures only one object is created
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    public void showMessage() {
        System.out.println("Double-Checked Locking Singleton");
    }
}


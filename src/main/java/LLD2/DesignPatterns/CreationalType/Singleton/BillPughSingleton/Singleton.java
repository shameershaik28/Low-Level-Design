package LLD2.DesignPatterns.CreationalType.Singleton.BillPughSingleton;

class Singleton {

    // Private constructor prevents external creation
    private Singleton() {}

    // Static inner class holds the singleton instance
    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    // Global access point
    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }

    public void showMessage() {
        System.out.println("Bill Pugh Singleton");
    }
}


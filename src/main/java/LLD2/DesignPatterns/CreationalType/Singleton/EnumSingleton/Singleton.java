package LLD2.DesignPatterns.CreationalType.Singleton.EnumSingleton;

enum Singleton {
    INSTANCE;   // the only instance

    public void showMessage() {
        System.out.println("Enum Singleton");
    }
}


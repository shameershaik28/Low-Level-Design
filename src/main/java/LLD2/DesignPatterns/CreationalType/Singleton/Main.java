package LLD2.DesignPatterns.Singleton;

public class Main {
    public static void main(String[] args) {

        // Getting the ONE singleton object
        CarSettingsManager manager = CarSettingsManager.getInstance();

        // Setting a value
        manager.setSetting("Sport Mode");

        // Getting the value
        System.out.println(manager.getSetting());

        // Get instance again (same object)
        CarSettingsManager manager2 = CarSettingsManager.getInstance();

        // Should print the same value
        System.out.println(manager2.getSetting());
    }
}


package LLD2.DesignPatterns.Singleton;

public class CarSettingsManager extends BaseSettings {

    // Singleton instance
    private static CarSettingsManager instance;

    // Private constructor
    private CarSettingsManager() {
    }

    // Only one instance will be created
    public static CarSettingsManager getInstance() {
        if (instance == null) {
            instance = new CarSettingsManager();
        }
        return instance;
    }

    // Reset instance (optional)
    public static void resetInstance() {
        instance = null;
    }

    @Override
    public void setSetting(String value) {
        this.setting = value;
    }

    @Override
    public String getSetting() {
        return this.setting;
    }
}


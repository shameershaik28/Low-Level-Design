package LLD2.DesignPatterns.StructuralType.Adapter.Example2;

class TemperatureAdapter implements Temperature {

    private FahrenheitSensor sensor;

    public TemperatureAdapter(FahrenheitSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTemperatureInCelsius() {
        double f = sensor.getTemperatureInFahrenheit();
        return (f - 32) * 5 / 9; // conversion logic
    }
}


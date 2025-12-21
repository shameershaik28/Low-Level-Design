package LLD2.DesignPatterns.StructuralType.Adapter.Example2;

public class Main {
    public static void main(String[] args) {

        FahrenheitSensor oldSensor = new FahrenheitSensor();

        Temperature temperature = new TemperatureAdapter(oldSensor);

        System.out.println("Temperature in Celsius: " +
                temperature.getTemperatureInCelsius());
    }
}


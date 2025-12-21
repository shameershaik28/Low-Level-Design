package LLD2.DesignPatterns.BehavioralType.Observer.Example1;

//step 5: Client Code

public class Main {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        Observer phone = new PhoneDisplay();
        Observer tv = new TVDisplay();

        station.addObserver(phone);
        station.addObserver(tv);

        station.setTemperature(25);
        station.setTemperature(30);
    }
}


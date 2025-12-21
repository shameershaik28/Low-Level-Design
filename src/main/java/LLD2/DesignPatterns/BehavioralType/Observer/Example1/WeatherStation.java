package LLD2.DesignPatterns.BehavioralType.Observer.Example1;

import java.util.ArrayList;
import java.util.List;

//Step 3: Concrete Subject – WeatherStation


class WeatherStation implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private int temperature;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers(); // notify everyone
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}


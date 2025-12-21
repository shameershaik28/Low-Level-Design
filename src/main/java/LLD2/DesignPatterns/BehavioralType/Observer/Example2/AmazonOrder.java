package LLD2.DesignPatterns.BehavioralType.Observer.Example2;

import java.util.ArrayList;
import java.util.List;

class AmazonOrder implements OrderSubject {

    private List<OrderObserver> observers = new ArrayList<>();
    private String orderStatus;

    @Override
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    public void setOrderStatus(String status) {
        this.orderStatus = status;
        notifyObservers(); // notify all services
    }

    @Override
    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(orderStatus);
        }
    }
}


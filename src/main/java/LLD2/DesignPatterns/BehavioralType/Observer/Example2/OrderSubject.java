package LLD2.DesignPatterns.BehavioralType.Observer.Example2;

interface OrderSubject {
    void addObserver(OrderObserver observer);
    void removeObserver(OrderObserver observer);
    void notifyObservers();
}


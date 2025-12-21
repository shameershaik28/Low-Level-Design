package LLD2.DesignPatterns.BehavioralType.Observer.Example1;

//Step 2

interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}


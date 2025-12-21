package LLD2.DesignPatterns.BehavioralType.Observer.Example1;

//Step 4: Concrete Observers

class TVDisplay implements Observer {

    @Override
    public void update(int temperature) {
        System.out.println("TV Display: Temperature is " + temperature + "°C");
    }
}


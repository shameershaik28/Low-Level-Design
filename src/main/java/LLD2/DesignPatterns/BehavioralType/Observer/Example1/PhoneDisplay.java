package LLD2.DesignPatterns.BehavioralType.Observer.Example1;

//Step 4: Concrete Observers

class PhoneDisplay implements Observer {

    @Override
    public void update(int temperature) {
        System.out.println("Phone Display: Temperature is " + temperature + "°C");
    }
}


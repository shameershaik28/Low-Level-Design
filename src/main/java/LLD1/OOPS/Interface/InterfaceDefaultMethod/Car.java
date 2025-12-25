package LLD1.OOPS.Interface.InterfaceDefaultMethod;

class Car implements Vehicle {

    @Override
    public void stop() { //default method from interface is overridden here
        System.out.println("Car stopped");
    }
    public void start() {
        System.out.println("Car starting...");
    }
}


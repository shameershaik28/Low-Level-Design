package OOPS.Interface.InterfaceDefaultMethod;

interface Vehicle {
    void start();                 // abstract method

    default void stop() {         // default method
        System.out.println("Vehicle stopped");
    }
}


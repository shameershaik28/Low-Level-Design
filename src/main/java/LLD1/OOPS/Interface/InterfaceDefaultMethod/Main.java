package LLD1.OOPS.Interface.InterfaceDefaultMethod;

public class Main {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();  // calls overridden method
        c.stop();   // calls default method from interface
    }
}

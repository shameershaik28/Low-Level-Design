package LLD1.OOPS.Interface;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();
        Vehicle v2 = new Bike();
        v2.start();


        Vehicle.cost();
        System.out.println(Vehicle.MAX_LIMIT);

    }
}

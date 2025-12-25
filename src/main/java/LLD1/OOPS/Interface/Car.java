package LLD1.OOPS.Interface;

import java.sql.SQLOutput;

public class Car implements Vehicle {

    int result = MAX_LIMIT;

    @Override
    public void start() {
        System.out.println("Car starts and speed limit is "+ result);
    }
}

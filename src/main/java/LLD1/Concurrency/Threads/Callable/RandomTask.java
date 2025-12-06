package LLD1.Concurrency.Threads.Callable;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;


// This RandomTask class using Random, timeUnit, Sleep and Callable in one class as an example

class RandomTask implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {

        // sleep for 1 second
        TimeUnit.SECONDS.sleep(5);

        // generate random number
        Random random = new Random();
        return random.nextInt(100);   // random 0–99
    }
}

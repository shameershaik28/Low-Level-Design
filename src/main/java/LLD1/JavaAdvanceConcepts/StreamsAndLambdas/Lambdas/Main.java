package LLD1.JavaAdvanceConcepts.StreamsAndLambdas.Lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       // Lambda with No parameter
        LambdaExample ex = () -> System.out.println("Hello From Lambda");
        ex.show();

        //Lambda with Parameters
        Calculator c = (a,b) -> a+b;

        System.out.println(c.add(10, 20));


        //Lambda with Runnable
        Thread t1 = new Thread(() -> System.out.println("Thread running with lambda"));
        t1.start();

        // Lambda with Comparator
        Comparator<String> comp = (a, b) -> a.length() - b.length();

        List<String> list = Arrays.asList("aaa", "b", "cc");
        list.sort((a, b) -> a.length() - b.length());

        System.out.println(list);

       // Lambda with ForEach
        List<Integer> nums = Arrays.asList(1,2,3,4);

        nums.forEach(n -> System.out.println(n));

        //Lambda with Callable
        Callable<String> task = () -> "Hello from Callable using Lambda";

        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> result = service.submit(task);

        System.out.println(result.get());

        service.shutdown();



    }
}

package LLD1.OOPS.ENUM.Example1;

public class Main {
    public static void main(String[] args) {

        // String today = "MONDAY";  // typo possible
           Day today = Day.MONDAY;   // compile-time safe



        System.out.println(today);


    }
}


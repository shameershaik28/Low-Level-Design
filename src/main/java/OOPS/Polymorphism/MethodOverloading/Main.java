package OOPS.Polymorphism.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));        // calls int,int
        System.out.println(calc.add(5, 10, 15));    // calls int,int,int
        System.out.println(calc.add(2.5, 3.5));     // calls double,double
    }
}

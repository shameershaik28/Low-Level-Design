package LLD1.OOPS.Polymorphism.MethodOverriding;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        Animal b = new Cat();
        b.sound();


    }
}

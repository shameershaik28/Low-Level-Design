package LLD1.OOPS.Interface.InterfaceAbstractMethods;

public class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("I'm a cat");
    }

    @Override
    public void eat() {
        System.out.println("I'm an eat");
    }
}

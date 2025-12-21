package LLD2.DesignPatterns.StructuralType.Decorator.Example1;

//Client Code

public class Main {
    public static void main(String[] args) {

        //Nested Decorators (One line)

        IceCream iceCream =
                new NutsDecorator(
                        new ChocolateDecorator(
                                new PlainIceCream()
                        )
                );

        System.out.println(iceCream.getDescription());
        System.out.println("Total Cost: " + iceCream.cost());
    }
}


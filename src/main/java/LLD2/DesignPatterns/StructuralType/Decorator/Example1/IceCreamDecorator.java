package LLD2.DesignPatterns.StructuralType.Decorator.Example1;

//Abstract Decorator

abstract class IceCreamDecorator implements IceCream {
    protected IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }
}

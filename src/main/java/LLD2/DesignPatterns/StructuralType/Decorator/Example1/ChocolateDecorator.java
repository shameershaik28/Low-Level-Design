package LLD2.DesignPatterns.StructuralType.Decorator.Example1;

//Concrete Decorators

class ChocolateDecorator extends IceCreamDecorator {

    public ChocolateDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Chocolate";
    }

    @Override
    public int cost() {
        return iceCream.cost() + 10;
    }
}


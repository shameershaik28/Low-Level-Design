package LLD2.DesignPatterns.StructuralType.Decorator.Example1;

//Concrete Decorators

class NutsDecorator extends IceCreamDecorator {

    public NutsDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Nuts";
    }

    @Override
    public int cost() {
        return iceCream.cost() + 15;
    }
}


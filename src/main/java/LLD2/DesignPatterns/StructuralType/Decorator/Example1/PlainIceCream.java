package LLD2.DesignPatterns.StructuralType.Decorator.Example1;

//Concrete Component (Plain Ice Cream)

class PlainIceCream implements IceCream {

    @Override
    public String getDescription() {
        return "Plain Ice Cream";
    }

    @Override
    public int cost() {
        return 20;
    }
}


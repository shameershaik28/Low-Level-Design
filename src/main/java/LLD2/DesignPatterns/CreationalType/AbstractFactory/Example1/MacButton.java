package LLD2.DesignPatterns.CreationalType.AbstractFactory.Example1;

//Step 2: Concrete products

class MacButton implements Button {
    public void paint() {
        System.out.println("Mac Button");
    }
}

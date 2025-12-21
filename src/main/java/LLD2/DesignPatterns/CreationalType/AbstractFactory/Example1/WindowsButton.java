package LLD2.DesignPatterns.CreationalType.AbstractFactory.Example1;

//Step 2: Concrete products
class WindowsButton implements Button {
    public void paint() {
        System.out.println("Windows Button");
    }
}

